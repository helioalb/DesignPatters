package me.helioalbano.designpatterns.behavioral.chainofresponsability.user;

import java.util.Optional;

public class User {
    private String name;
    private Address address;
    private BankAccount bankAccount;
    private String inconsistences;
	
    public User(String name, Address address, BankAccount bankAccount) {
		this.name = name;
		this.address = address;
		this.bankAccount = bankAccount;
		this.inconsistences = "";
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public Address getAddress() {
		return address;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void addInconsistence(String inconsistence) {
		String newInconsistence = inconsistence + " ";
		inconsistences = getInconsistences() + newInconsistence;
	}

	public String getInconsistences() {
		return inconsistences;
	}
}
