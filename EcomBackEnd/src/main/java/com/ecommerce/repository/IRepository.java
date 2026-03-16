/**
 * IRepository Generic Interface
 * Base repository interface with CRUD operations
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.repository;

import com.ecommerce.domain.IDomain;
import java.util.List;
import java.util.Optional;

public interface IRepository<T extends IDomain> {
    /**
     * Create a new entity
     * @param entity the entity to create
     * @return the created entity
     */
    T create(T entity);

    /**
     * Read an entity by ID
     * @param id the entity ID
     * @return Optional containing the entity if found
     */
    Optional<T> read(Long id);

    /**
     * Read all entities
     * @return List of all entities
     */
    List<T> readAll();

    /**
     * Update an existing entity
     * @param entity the entity to update
     * @return the updated entity
     */
    T update(T entity);

    /**
     * Delete an entity by ID
     * @param id the entity ID
     * @return true if deleted, false otherwise
     */
    boolean delete(Long id);
}
