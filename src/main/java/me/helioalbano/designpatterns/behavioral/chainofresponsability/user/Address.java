package me.helioalbano.designpatterns.behavioral.chainofresponsability.user;

import java.util.Optional;

public class Address {
    private String zipcode;
    private String city;
    private String neighborhood;
    private String street;
    private String number;

    public Address(String zipcode, String city, String neighborhood, String street, String number) {
        this.zipcode = zipcode;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
    }

    public Optional<String> getZipcode() {
        return Optional.ofNullable(zipcode);
    }

    public Optional<String> getCity() {
        return Optional.ofNullable(city);
    }

    public Optional<String> getNeighborhood() {
        return Optional.ofNullable( neighborhood);
    }

    public Optional<String> getStreet() {
    	return Optional.ofNullable(street);
    }

    public Optional<String> getNumber() {
    	return Optional.ofNullable(number);
    }
}
