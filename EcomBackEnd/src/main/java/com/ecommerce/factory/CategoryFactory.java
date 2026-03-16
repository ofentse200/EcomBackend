/**
 * CategoryFactory
 * Factory class for creating Category instances
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.Category;

public class CategoryFactory {
    /**
     * Create a category
     */
    public static Category createCategory(Long id, String name, String description) {
        return new Category.Builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }
}
