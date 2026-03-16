/**
 * Entity Abstract Class
 * Base abstract class for all domain entities
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

public abstract class Entity implements IDomain {
    protected Long id;

    public Entity() {
    }

    public Entity(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
