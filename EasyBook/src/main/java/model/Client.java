package model;

import service.enums.StatusClient;

public class Client {

    private String idClient;
    private String name;
    private String birthDate;
    private StatusClient statusClient;
    private String cpf;
    private Address address;

    public Client(String idClient, String name, String birthDate, StatusClient statusClient, String cpf, Address address) {
        this.idClient = idClient;
        this.name = name;
        this.birthDate = birthDate;
        this.statusClient = statusClient;
        this.cpf = cpf;
        this.address = address;
    }

    public void print(){
        System.out.println("idClient: "+idClient);
        System.out.println("name: "+name);
        System.out.println("birthDate: "+birthDate);
        System.out.println("statusClient: "+statusClient);
        System.out.println("cpf: "+cpf);
        System.out.println("Address: ");
        System.out.println("Street: "+address.getStreet());
        System.out.println("City: "+address.getCity());
        System.out.println("PostalCode: "+address.getPostalCode());
        System.out.println("NumberOfHouse: "+address.getNumberHouse());

    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public StatusClient getStatusClient() {
        return statusClient;
    }

    public void setStatusClient(StatusClient statusClient) {
        this.statusClient = statusClient;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
