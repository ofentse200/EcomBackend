/**
 * Main Application Class
 * Entry point for the E-commerce Backend Application
 * Demonstrates the first step (Entity Milestone) of the project
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce;

import com.ecommerce.domain.*;
import com.ecommerce.factory.*;
import com.ecommerce.repository.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("E-commerce Backend Application");
        System.out.println("Entity Milestone - First Step");
        System.out.println("=================================\n");

        // Demonstrate User Creation
        demonstrateUserManagement();

        // Demonstrate Product Creation
        demonstrateProductManagement();

        // Demonstrate Category Creation
        demonstrateCategoryManagement();

        // Demonstrate Address Creation
        demonstrateAddressManagement();

        // Demonstrate Cart Management
        demonstrateCartManagement();

        // Demonstrate Order Management
        demonstrateOrderManagement();

        // Demonstrate PCBuild Management
        demonstratePCBuildManagement();

        System.out.println("\n=================================");
        System.out.println("Entity Milestone Completed!");
        System.out.println("=================================");
    }

    private static void demonstrateUserManagement() {
        System.out.println("\n--- User Management ---");
        User user1 = UserFactory.createUser(1L, "john_doe", "john@email.com", "password123",
                "John", "Doe", "1234567890");
        User user2 = UserFactory.createUser(2L, "jane_smith", "jane@email.com");

        System.out.println("Created User 1: " + user1);
        System.out.println("Created User 2: " + user2);
    }

    private static void demonstrateProductManagement() {
        System.out.println("\n--- Product Management ---");
        ProductRepository productRepo = new ProductRepository();

        Product product1 = ProductFactory.createProduct(1L, "Gaming Laptop", "High-performance gaming laptop",
                1299.99, 10, "Electronics");
        Product product2 = ProductFactory.createProduct(2L, "Wireless Mouse", "Ergonomic wireless mouse",
                29.99, 50, "Peripherals");
        Product product3 = ProductFactory.createProduct(3L, "USB-C Cable", "Fast USB-C charging cable",
                9.99, 100, "Accessories");

        productRepo.create(product1);
        productRepo.create(product2);
        productRepo.create(product3);

        System.out.println("Created Product 1: " + product1);
        System.out.println("Created Product 2: " + product2);
        System.out.println("Created Product 3: " + product3);
        System.out.println("Total products in database: " + productRepo.readAll().size());
    }

    private static void demonstrateCategoryManagement() {
        System.out.println("\n--- Category Management ---");
        Category cat1 = CategoryFactory.createCategory(1L, "Electronics", "Electronic devices and gadgets");
        Category cat2 = CategoryFactory.createCategory(2L, "Peripherals", "Computer peripherals and accessories");
        Category cat3 = CategoryFactory.createCategory(3L, "Accessories", "Various accessories");

        System.out.println("Created Category 1: " + cat1);
        System.out.println("Created Category 2: " + cat2);
        System.out.println("Created Category 3: " + cat3);
    }

    private static void demonstrateAddressManagement() {
        System.out.println("\n--- Address Management ---");
        Address addr1 = AddressFactory.createAddress(1L, "123 Main St", "New York", "NY",
                "10001", "USA", 1L);
        Address addr2 = AddressFactory.createAddress(2L, "456 Oak Ave", "Los Angeles", "CA",
                "90001", "USA", 2L);

        System.out.println("Created Address 1: " + addr1);
        System.out.println("Created Address 2: " + addr2);
    }

    private static void demonstrateCartManagement() {
        System.out.println("\n--- Cart Management ---");
        Cart cart = new Cart.Builder()
                .id(1L)
                .userId(1L)
                .build();

        CartItem item1 = new CartItem.Builder()
                .id(1L)
                .productId(1L)
                .quantity(1)
                .price(1299.99)
                .build();

        CartItem item2 = new CartItem.Builder()
                .id(2L)
                .productId(2L)
                .quantity(2)
                .price(29.99)
                .build();

        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println("Created Cart: " + cart);
        System.out.println("Cart Item 1: " + item1);
        System.out.println("Cart Item 2: " + item2);
    }

    private static void demonstrateOrderManagement() {
        System.out.println("\n--- Order Management ---");
        List<OrderItem> items = new ArrayList<>();

        OrderItem orderItem1 = new OrderItem.Builder()
                .id(1L)
                .orderId(1L)
                .productId(1L)
                .quantity(1)
                .price(1299.99)
                .build();

        OrderItem orderItem2 = new OrderItem.Builder()
                .id(2L)
                .orderId(1L)
                .productId(2L)
                .quantity(2)
                .price(29.99)
                .build();

        items.add(orderItem1);
        items.add(orderItem2);

        Order order = new Order.Builder()
                .id(1L)
                .userId(1L)
                .orderDate("2026-03-16")
                .status("Pending")
                .items(items)
                .totalAmount(1359.97)
                .addressId(1L)
                .build();

        System.out.println("Created Order: " + order);
        System.out.println("Order Item 1: " + orderItem1);
        System.out.println("Order Item 2: " + orderItem2);
    }

    private static void demonstratePCBuildManagement() {
        System.out.println("\n--- PC Build Management ---");
        List<Long> components = new ArrayList<>();
        components.add(1L);
        components.add(2L);
        components.add(3L);

        PCBuild build = new PCBuild.Builder()
                .id(1L)
                .buildName("Gaming PC Build")
                .description("High-end gaming PC configuration")
                .componentIds(components)
                .totalPrice(3500.00)
                .userId(1L)
                .build();

        CompatibilityRule rule = new CompatibilityRule.Builder()
                .id(1L)
                .componentId1(1L)
                .componentId2(2L)
                .compatible(true)
                .reason("Socket compatibility verified")
                .build();

        System.out.println("Created PCBuild: " + build);
        System.out.println("Created Compatibility Rule: " + rule);
    }
}
