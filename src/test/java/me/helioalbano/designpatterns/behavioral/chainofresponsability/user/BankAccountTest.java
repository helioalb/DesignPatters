package me.helioalbano.designpatterns.behavioral.chainofresponsability.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount bankAccount = new BankAccount("2195-4", null);
		
		assertFalse(bankAccount.getAgency().isEmpty());
		assertTrue(bankAccount.getAccount().isEmpty());
	}
}
