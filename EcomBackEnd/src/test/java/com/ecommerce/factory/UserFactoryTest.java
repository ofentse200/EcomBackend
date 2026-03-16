/**
 * UserFactoryTest
 * Test class for UserFactory using TDD approach
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void testCreateUserWithBasicInfo() {
        // Arrange
        Long id = 1L;
        String username = "john_doe";
        String email = "john@example.com";

        // Act
        User user = UserFactory.createUser(id, username, email);

        // Assert
        assertNotNull(user);
        assertEquals(id, user.getId());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testCreateUserWithAllDetails() {
        // Arrange
        Long id = 2L;
        String username = "jane_smith";
        String email = "jane@example.com";
        String password = "secure123";
        String firstName = "Jane";
        String lastName = "Smith";
        String phone = "1234567890";

        // Act
        User user = UserFactory.createUser(id, username, email, password, firstName, lastName, phone);

        // Assert
        assertNotNull(user);
        assertEquals(id, user.getId());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(phone, user.getPhone());
    }

    @Test
    public void testUserBuilderPattern() {
        // Arrange & Act
        User user = new User.Builder()
                .id(3L)
                .username("bob_wilson")
                .email("bob@example.com")
                .password("pass123")
                .firstName("Bob")
                .lastName("Wilson")
                .phone("9876543210")
                .build();

        // Assert
        assertNotNull(user);
        assertEquals("bob_wilson", user.getUsername());
        assertEquals("bob@example.com", user.getEmail());
    }

    @Test
    public void testUserEmailIsNotNull() {
        // Arrange & Act
        User user = UserFactory.createUser(4L, "test_user", "test@example.com");

        // Assert
        assertNotNull("Email should not be null", user.getEmail());
    }
}
