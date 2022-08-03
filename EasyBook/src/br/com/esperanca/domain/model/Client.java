package br.com.esperanca.domain.model;

import br.com.esperanca.domain.Enums.StatusClient;

public class Client {
    private String idRegistration;
    private String name;
    private String birthDate;
    private StatusClient statusClient;
    private String cpf;
    private Address address;

    public Client() {

    }

    public Client(String idRegitration, String name, String birthDate, StatusClient statusClient, String cpf, Address address) {
        this.idRegistration = idRegitration;
        this.name = name;
        this.birthDate = birthDate;
        this.statusClient = statusClient;
        this.cpf = cpf;
        this.address = address;
    }

    public void print(){
        System.out.println("ID: "+idRegistration);
        System.out.println("name: "+name);
        System.out.println("birthDate: "+birthDate);
        System.out.println("cpf: "+cpf);
        System.out.println("status: "+statusClient);
        System.out.println("address: "+address.getStreet());

    }

    public String getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegitration(String idRegitration) {
        this.idRegistration = idRegitration;
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

    public StatusClient getStatus() {
        return statusClient;
    }

    public void setStatus(StatusClient statusClient) {
        this.statusClient = statusClient;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
