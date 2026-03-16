/**
 * PCBuild Domain Entity
 * Represents a custom PC build configuration in the e-commerce system
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;

public class PCBuild extends Entity {
    private String buildName;
    private String description;
    private List<Long> componentIds;
    private double totalPrice;
    private Long userId;

    // Builder Pattern Implementation
    public static class Builder {
        private Long id;
        private String buildName;
        private String description;
        private List<Long> componentIds;
        private double totalPrice;
        private Long userId;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder buildName(String buildName) {
            this.buildName = buildName;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder componentIds(List<Long> componentIds) {
            this.componentIds = componentIds;
            return this;
        }

        public Builder totalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public PCBuild build() {
            return new PCBuild(this);
        }
    }

    private PCBuild(Builder builder) {
        this.id = builder.id;
        this.buildName = builder.buildName;
        this.description = builder.description;
        this.componentIds = builder.componentIds != null ? builder.componentIds : new ArrayList<>();
        this.totalPrice = builder.totalPrice;
        this.userId = builder.userId;
    }

    // Getters and Setters
    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getComponentIds() {
        return componentIds;
    }

    public void setComponentIds(List<Long> componentIds) {
        this.componentIds = componentIds;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PCBuild{" +
                "id=" + id +
                ", buildName='" + buildName + '\'' +
                ", description='" + description + '\'' +
                ", components=" + componentIds.size() +
                ", totalPrice=" + totalPrice +
                ", userId=" + userId +
                '}';
    }
}
