/**
 * UserFactory
 * Factory class for creating User instances
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.User;

public class UserFactory {
    /**
     * Create a user with basic information
     */
    public static User createUser(Long id, String username, String email) {
        return new User.Builder()
                .id(id)
                .username(username)
                .email(email)
                .build();
    }

    /**
     * Create a user with all details
     */
    public static User createUser(Long id, String username, String email, String password,
                                  String firstName, String lastName, String phone) {
        return new User.Builder()
                .id(id)
                .username(username)
                .email(email)
                .password(password)
                .firstName(firstName)
                .lastName(lastName)
                .phone(phone)
                .build();
    }
}
