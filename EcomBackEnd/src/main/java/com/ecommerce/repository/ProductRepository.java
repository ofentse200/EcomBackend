/**
 * ProductRepository Implementation
 * Repository implementation for Product entities
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.repository;

import com.ecommerce.domain.Product;
import java.util.*;

public class ProductRepository implements IRepository<Product> {
    private static final Map<Long, Product> database = new HashMap<>();
    private static Long nextId = 1L;

    @Override
    public Product create(Product entity) {
        if (entity.getId() == null) {
            entity.setId(nextId++);
        }
        database.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public Optional<Product> read(Long id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public List<Product> readAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Product update(Product entity) {
        if (database.containsKey(entity.getId())) {
            database.put(entity.getId(), entity);
            return entity;
        }
        throw new IllegalArgumentException("Product with ID " + entity.getId() + " not found");
    }

    @Override
    public boolean delete(Long id) {
        return database.remove(id) != null;
    }

    // Helper method for testing - clear the database
    public static void clear() {
        database.clear();
        nextId = 1L;
    }
}
