package me.helioalbano.designpatterns.behavioral.chainofresponsability;

import me.helioalbano.designpatterns.behavioral.chainofresponsability.user.User;

public interface Validator {
    public Validator next(Validator validator);
    public void validate(User user);
}
