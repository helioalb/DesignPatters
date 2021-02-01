package me.helioalbano.designpatterns.behavioral.chainofresponsability;

import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.User;

public abstract class ValidatorBase implements Validator {

	private Validator validator;


	@Override
	public Validator next(Validator validator) {
		this.validator = validator;
		
		return this.validator;
	}


	@Override
	public void validate(User user) {
		String inconsistence = check(user);
		user.addInconsistence(inconsistence);
		
		if (this.validator != null) {
			this.validator.validate(user);
		}
	}


	protected abstract String check(User user);

}
