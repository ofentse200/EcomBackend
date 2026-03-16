/**
 * ProductRepositoryTest
 * Test class for ProductRepository using TDD approach
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.repository;

import com.ecommerce.domain.Product;
import com.ecommerce.factory.ProductFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class ProductRepositoryTest {

    private ProductRepository repository;
    private Product testProduct;

    @Before
    public void setUp() {
        repository = new ProductRepository();
        ProductRepository.clear();
        testProduct = ProductFactory.createProduct(1L, "Test Product", 99.99);
    }

    @Test
    public void testCreateProduct() {
        // Act
        Product created = repository.create(testProduct);

        // Assert
        assertNotNull(created);
        assertEquals(testProduct.getId(), created.getId());
        assertEquals(testProduct.getName(), created.getName());
    }

    @Test
    public void testReadProduct() {
        // Arrange
        repository.create(testProduct);

        // Act
        Optional<Product> found = repository.read(1L);

        // Assert
        assertTrue(found.isPresent());
        assertEquals(testProduct.getName(), found.get().getName());
    }

    @Test
    public void testReadProductNotFound() {
        // Act
        Optional<Product> found = repository.read(999L);

        // Assert
        assertFalse(found.isPresent());
    }

    @Test
    public void testReadAllProducts() {
        // Arrange
        Product product1 = ProductFactory.createProduct(1L, "Product 1", 49.99);
        Product product2 = ProductFactory.createProduct(2L, "Product 2", 79.99);
        repository.create(product1);
        repository.create(product2);

        // Act
        List<Product> products = repository.readAll();

        // Assert
        assertNotNull(products);
        assertEquals(2, products.size());
    }

    @Test
    public void testUpdateProduct() {
        // Arrange
        repository.create(testProduct);
        testProduct.setName("Updated Product");

        // Act
        Product updated = repository.update(testProduct);

        // Assert
        assertNotNull(updated);
        assertEquals("Updated Product", updated.getName());
    }

    @Test
    public void testDeleteProduct() {
        // Arrange
        repository.create(testProduct);

        // Act
        boolean deleted = repository.delete(1L);

        // Assert
        assertTrue(deleted);
        assertFalse(repository.read(1L).isPresent());
    }

    @Test
    public void testDeleteProductNotFound() {
        // Act
        boolean deleted = repository.delete(999L);

        // Assert
        assertFalse(deleted);
    }
}
