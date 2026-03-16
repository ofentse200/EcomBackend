/**
 * ProductFactoryTest
 * Test class for ProductFactory using TDD approach
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFactoryTest {

    @Before
    public void setUp() {
        // Setup code if needed
    }

    @Test
    public void testCreateProductWithBasicInfo() {
        // Arrange
        Long id = 1L;
        String name = "Laptop";
        double price = 899.99;

        // Act
        Product product = ProductFactory.createProduct(id, name, price);

        // Assert
        assertNotNull(product);
        assertEquals(id, product.getId());
        assertEquals(name, product.getName());
        assertEquals(price, product.getPrice(), 0.01);
        assertEquals(0, product.getQuantity());
    }

    @Test
    public void testCreateProductWithAllDetails() {
        // Arrange
        Long id = 2L;
        String name = "Mouse";
        String description = "Wireless Mouse";
        double price = 29.99;
        int quantity = 50;
        String category = "Peripherals";

        // Act
        Product product = ProductFactory.createProduct(id, name, description, price, quantity, category);

        // Assert
        assertNotNull(product);
        assertEquals(id, product.getId());
        assertEquals(name, product.getName());
        assertEquals(description, product.getDescription());
        assertEquals(price, product.getPrice(), 0.01);
        assertEquals(quantity, product.getQuantity());
        assertEquals(category, product.getCategory());
    }

    @Test
    public void testProductBuilderPattern() {
        // Arrange & Act
        Product product = new Product.Builder()
                .id(3L)
                .name("Keyboard")
                .description("Mechanical Keyboard")
                .price(149.99)
                .quantity(25)
                .category("Peripherals")
                .build();

        // Assert
        assertNotNull(product);
        assertEquals(Long.valueOf(3L), product.getId());
        assertEquals("Keyboard", product.getName());
        assertEquals("Mechanical Keyboard", product.getDescription());
        assertEquals(149.99, product.getPrice(), 0.01);
        assertEquals(25, product.getQuantity());
        assertEquals("Peripherals", product.getCategory());
    }

    @Test
    public void testProductPriceIsPositive() {
        // Arrange
        Long id = 4L;
        String name = "Monitor";
        double price = 299.99;

        // Act
        Product product = ProductFactory.createProduct(id, name, price);

        // Assert
        assertTrue("Price should be positive", product.getPrice() > 0);
    }
}
