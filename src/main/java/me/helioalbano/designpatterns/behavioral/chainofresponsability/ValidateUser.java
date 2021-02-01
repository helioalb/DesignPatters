package me.helioalbano.designpatterns.behavioral.chainofresponsability;

import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.User;

public class ValidateUser extends ValidatorBase {

	@Override
	protected String check(User user) {
		String inconsistences = "";
		
		if (user.getName().isEmpty()) {
			inconsistences += "The user name should be informed, ";
		}
		
		return inconsistences;
	}

}
