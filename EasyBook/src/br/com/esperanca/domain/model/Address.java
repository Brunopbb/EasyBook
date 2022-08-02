package br.com.esperanca.domain.model;

public class Address {

    private String street;
    private String postalCode;
    private String city;
    private int numberHouse;

    public Address() {
    }

    public Address(String street, String postalCode, String city, int numberHouse) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.numberHouse = numberHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }
}
