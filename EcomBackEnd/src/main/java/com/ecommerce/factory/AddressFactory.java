/**
 * AddressFactory
 * Factory class for creating Address instances
 * 
 * Author: [Your Name] ([Student Number])
 * Date: [Date]
 */
package com.ecommerce.factory;

import com.ecommerce.domain.Address;

public class AddressFactory {
    /**
     * Create an address
     */
    public static Address createAddress(Long id, String street, String city, String state,
                                       String postalCode, String country, Long userId) {
        return new Address.Builder()
                .id(id)
                .street(street)
                .city(city)
                .state(state)
                .postalCode(postalCode)
                .country(country)
                .userId(userId)
                .build();
    }
}
