/**
 * CompatibilityRule Domain Entity
 * Represents a PC component compatibility rule
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

public class CompatibilityRule extends Entity {
    private Long componentId1;
    private Long componentId2;
    private boolean compatible;
    private String reason;

    // Builder Pattern Implementation
    public static class Builder {
        private Long id;
        private Long componentId1;
        private Long componentId2;
        private boolean compatible;
        private String reason;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder componentId1(Long componentId1) {
            this.componentId1 = componentId1;
            return this;
        }

        public Builder componentId2(Long componentId2) {
            this.componentId2 = componentId2;
            return this;
        }

        public Builder compatible(boolean compatible) {
            this.compatible = compatible;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public CompatibilityRule build() {
            return new CompatibilityRule(this);
        }
    }

    private CompatibilityRule(Builder builder) {
        this.id = builder.id;
        this.componentId1 = builder.componentId1;
        this.componentId2 = builder.componentId2;
        this.compatible = builder.compatible;
        this.reason = builder.reason;
    }

    // Getters and Setters
    public Long getComponentId1() {
        return componentId1;
    }

    public void setComponentId1(Long componentId1) {
        this.componentId1 = componentId1;
    }

    public Long getComponentId2() {
        return componentId2;
    }

    public void setComponentId2(Long componentId2) {
        this.componentId2 = componentId2;
    }

    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CompatibilityRule{" +
                "id=" + id +
                ", componentId1=" + componentId1 +
                ", componentId2=" + componentId2 +
                ", compatible=" + compatible +
                ", reason='" + reason + '\'' +
                '}';
    }
}
