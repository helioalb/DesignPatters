package me.helioalbano.designpatterns.behavioral.chainofresponsability;

import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.Address;
import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.User;

public class ValidateAddress extends ValidatorBase {

	@Override
	protected String check(User user) {
		String inconsistences = "";
		
		Address address = user.getAddress();
		
		if (address == null) {
			inconsistences += "A complete address should be informed, ";
		} else {
			if (address.getZipcode().isEmpty()) {
				inconsistences += "The zipcode should be informed, ";
			}
			
			if (address.getCity().isEmpty()) {
				inconsistences += "The city should be informed, ";
			}
			
			if (address.getNeighborhood().isEmpty()) {
				inconsistences += "The neighborhood should be informed, ";
			}
			
			if (address.getStreet().isEmpty()) {
				inconsistences += "The street should be informed, ";
			}
			
			if (address.getNumber().isEmpty()) {
				inconsistences += "The number should be informed, ";
			}
		}
		
		return inconsistences;
	}

}
