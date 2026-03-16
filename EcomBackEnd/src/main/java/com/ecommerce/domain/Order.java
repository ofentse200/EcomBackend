/**
 * Order Domain Entity
 * Represents an order in the e-commerce system
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;

public class Order extends Entity {
    private Long userId;
    private String orderDate;
    private String status;
    private List<OrderItem> items;
    private double totalAmount;
    private Long addressId;

    // Builder Pattern Implementation
    public static class Builder {
        private Long id;
        private Long userId;
        private String orderDate;
        private String status;
        private List<OrderItem> items;
        private double totalAmount;
        private Long addressId;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder orderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder items(List<OrderItem> items) {
            this.items = items;
            return this;
        }

        public Builder totalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder addressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    private Order(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.orderDate = builder.orderDate;
        this.status = builder.status;
        this.items = builder.items != null ? builder.items : new ArrayList<>();
        this.totalAmount = builder.totalAmount;
        this.addressId = builder.addressId;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderDate='" + orderDate + '\'' +
                ", status='" + status + '\'' +
                ", items=" + items.size() +
                ", totalAmount=" + totalAmount +
                ", addressId=" + addressId +
                '}';
    }
}
