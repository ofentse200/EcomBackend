/**
 * AddressFactoryTest
 * Test class for AddressFactory using TDD approach
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.Address;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressFactoryTest {

    @Test
    public void testCreateAddress() {
        // Arrange
        Long id = 1L;
        String street = "123 Main St";
        String city = "New York";
        String state = "NY";
        String postalCode = "10001";
        String country = "USA";
        Long userId = 1L;

        // Act
        Address address = AddressFactory.createAddress(id, street, city, state, postalCode, country, userId);

        // Assert
        assertNotNull(address);
        assertEquals(id, address.getId());
        assertEquals(street, address.getStreet());
        assertEquals(city, address.getCity());
        assertEquals(state, address.getState());
        assertEquals(postalCode, address.getPostalCode());
        assertEquals(country, address.getCountry());
        assertEquals(userId, address.getUserId());
    }

    @Test
    public void testAddressBuilderPattern() {
        // Arrange & Act
        Address address = new Address.Builder()
                .id(2L)
                .street("456 Oak Ave")
                .city("Los Angeles")
                .state("CA")
                .postalCode("90001")
                .country("USA")
                .userId(2L)
                .build();

        // Assert
        assertNotNull(address);
        assertEquals("Los Angeles", address.getCity());
    }

    @Test
    public void testAddressHasValidPostalCode() {
        // Arrange & Act
        Address address = AddressFactory.createAddress(3L, "789 Elm St", "Chicago", "IL", 
                "60601", "USA", 3L);

        // Assert
        assertNotNull("Postal code should not be null", address.getPostalCode());
    }
}
