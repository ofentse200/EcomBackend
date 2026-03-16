/**
 * AddressTest
 * Test class for Address domain entity
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    @Test
    public void testAddressCreation() {
        // Arrange & Act
        Address address = new Address.Builder()
                .id(1L)
                .street("123 Main St")
                .city("New York")
                .state("NY")
                .postalCode("10001")
                .country("USA")
                .userId(1L)
                .build();

        // Assert
        assertNotNull(address);
        assertEquals(Long.valueOf(1L), address.getId());
    }

    @Test
    public void testAddressGettersAndSetters() {
        // Arrange
        Address address = new Address.Builder()
                .id(2L)
                .street("456 Oak Ave")
                .city("Los Angeles")
                .state("CA")
                .postalCode("90001")
                .country("USA")
                .userId(2L)
                .build();

        // Act
        address.setStreet("789 New St");
        String updatedStreet = address.getStreet();

        // Assert
        assertEquals("789 New St", updatedStreet);
    }

    @Test
    public void testAddressToString() {
        // Arrange & Act
        Address address = new Address.Builder()
                .id(3L)
                .street("321 Pine St")
                .city("Boston")
                .state("MA")
                .postalCode("02101")
                .country("USA")
                .userId(3L)
                .build();

        String result = address.toString();

        // Assert
        assertTrue(result.contains("Boston"));
        assertTrue(result.contains("MA"));
    }
}
