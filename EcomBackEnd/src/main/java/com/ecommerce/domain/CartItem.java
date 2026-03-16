/**
 * CartItem Domain Entity
 * Represents an item in a shopping cart
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

public class CartItem extends Entity {
    private Long productId;
    private int quantity;
    private double price;

    // Builder Pattern Implementation
    public static class Builder {
        private Long id;
        private Long productId;
        private int quantity;
        private double price;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public CartItem build() {
            return new CartItem(this);
        }
    }

    private CartItem(Builder builder) {
        this.id = builder.id;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.price = builder.price;
    }

    // Getters and Setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + getTotal() +
                '}';
    }
}
