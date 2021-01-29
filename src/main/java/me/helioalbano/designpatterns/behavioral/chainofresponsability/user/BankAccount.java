package me.helioalbano.designpatterns.behavioral.chainofresponsability.user;

import java.util.Optional;

public class BankAccount {
	private String agency;
	private String account;
	
	public BankAccount(String agency, String account) {
		this.agency = agency;
		this.account = account;
	}
	
	public Optional<String> getAgency() {
		return Optional.ofNullable(agency);
	}
	
	public Optional<String> getAccount() {
		return Optional.ofNullable(account);
	}
}
