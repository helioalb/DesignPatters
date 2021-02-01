package me.helioalbano.designpatterns.behavioral.chainofresponsability;

import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.BankAccount;
import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.User;

public class ValidateBankAccount extends ValidatorBase {

	@Override
	protected String check(User user) {
		String inconsistences = "";
		BankAccount account = user.getBankAccount();
		
		if (account == null) {
			inconsistences += "A complete bank account should be informed, ";
		} else {
			if (account.getAgency().isEmpty()) {
				inconsistences += "Bank agency should be informed, ";
			}
			
			if (account.getAccount().isEmpty()) {
				inconsistences += "Banck account should be informed, ";
			}
		}
		
		return inconsistences;
	}
}
