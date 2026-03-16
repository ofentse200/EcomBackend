/**
 * CategoryFactoryTest
 * Test class for CategoryFactory using TDD approach
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.Category;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryFactoryTest {

    @Test
    public void testCreateCategory() {
        // Arrange
        Long id = 1L;
        String name = "Electronics";
        String description = "Electronic devices and gadgets";

        // Act
        Category category = CategoryFactory.createCategory(id, name, description);

        // Assert
        assertNotNull(category);
        assertEquals(id, category.getId());
        assertEquals(name, category.getName());
        assertEquals(description, category.getDescription());
    }

    @Test
    public void testCategoryBuilderPattern() {
        // Arrange & Act
        Category category = new Category.Builder()
                .id(2L)
                .name("Peripherals")
                .description("Computer peripherals")
                .build();

        // Assert
        assertNotNull(category);
        assertEquals("Peripherals", category.getName());
    }

    @Test
    public void testCategoryNameIsNotEmpty() {
        // Arrange & Act
        Category category = CategoryFactory.createCategory(3L, "Accessories", "Accessories description");

        // Assert
        assertNotNull("Category name should not be null", category.getName());
        assertFalse("Category name should not be empty", category.getName().isEmpty());
    }
}
