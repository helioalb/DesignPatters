package me.helioalbano.designpatterns.behavioral.chainofresponsability.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddressTest {

	@Test
	void testGetZipcode() {
		Address address = new Address("12345678", "São Paulo", null, null, null);

		assertFalse(address.getZipcode().isEmpty());
		assertFalse(address.getCity().isEmpty());
		assertTrue(address.getNeighborhood().isEmpty());
		assertTrue(address.getStreet().isEmpty());
		assertTrue(address.getNumber().isEmpty());
	}

}
