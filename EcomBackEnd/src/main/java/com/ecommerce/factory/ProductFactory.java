/**
 * ProductFactory
 * Factory class for creating Product instances using TDD
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.Product;

public class ProductFactory {
    /**
     * Create a product with basic information
     * @param id the product ID
     * @param name the product name
     * @param price the product price
     * @return a new Product instance
     */
    public static Product createProduct(Long id, String name, double price) {
        return new Product.Builder()
                .id(id)
                .name(name)
                .price(price)
                .quantity(0)
                .build();
    }

    /**
     * Create a product with all details
     * @param id the product ID
     * @param name the product name
     * @param description the product description
     * @param price the product price
     * @param quantity the product quantity
     * @param category the product category
     * @return a new Product instance
     */
    public static Product createProduct(Long id, String name, String description,
                                       double price, int quantity, String category) {
        return new Product.Builder()
                .id(id)
                .name(name)
                .description(description)
                .price(price)
                .quantity(quantity)
                .category(category)
                .build();
    }
}
