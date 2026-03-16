/**
 * Cart Domain Entity
 * Represents a shopping cart in the e-commerce system
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Entity {
    private Long userId;
    private List<CartItem> items;
    private double totalAmount;

    // Builder Pattern Implementation
    public static class Builder {
        private Long id;
        private Long userId;
        private List<CartItem> items;
        private double totalAmount;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder items(List<CartItem> items) {
            this.items = items;
            return this;
        }

        public Builder totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Cart build() {
            return new Cart(this);
        }
    }

    private Cart(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.items = builder.items != null ? builder.items : new ArrayList<>();
        this.totalAmount = builder.totalAmount;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void addItem(CartItem item) {
        this.items.add(item);
        updateTotalAmount();
    }

    public void removeItem(CartItem item) {
        this.items.remove(item);
        updateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void updateTotalAmount() {
        this.totalAmount = this.items.stream()
                .mapToDouble(CartItem::getTotal)
                .sum();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", items=" + items.size() +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
