package me.helioalbano.designpatterns.behavioral.chainofresponsability.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.helioalbano.designpatterns.behavioral.chainofresponsability.ValidateAddress;
import me.helioalbano.designpatterns.behavioral.chainofresponsability.ValidateBankAccount;
import me.helioalbano.designpatterns.behavioral.chainofresponsability.ValidateUser;
import me.helioalbano.designpatterns.behavioral.chainofresponsability.Validator;

class MainTest {
	private User user;
	
	@BeforeEach
	void setUp() {
		BankAccount account = new BankAccount(null, "12345");
		Address address = new Address("12345678", "São Paulo", null, "Rua dos bobos", null);
		user = new User(null, address, account);
	}

	@Test
	void test() {
		Validator validateUser = new ValidateUser();
		Validator validateBankAccount = new ValidateBankAccount();
		Validator validateAddress = new ValidateAddress();
		
		validateUser.next(validateAddress).next(validateBankAccount);
		
		validateUser.validate(user);
		
		String expected = "The user name should be informed,  The neighborhood should be informed, The number should be informed,  Bank agency should be informed,  ";
		assertEquals(expected, user.getInconsistences());
	}

}
