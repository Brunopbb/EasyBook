package model;

public class Address {

    private String street;
    private String city;
    private String postalCode;
    private int numberHouse;

    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }

    public Address(String street, String city, String postalCode, int numberHouse) {
        this(street, city);
        this.postalCode = postalCode;
        this.numberHouse = numberHouse;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }
}
