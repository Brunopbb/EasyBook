package br.com.esperanca.domain.model;

public class Client {
    private String idRegistration;
    private String name;
    private String birthDate;
    private String status;
    private String cpf;
    private Address address;

    public Client() {

    }

    public Client(String idRegitration, String name, String birthDate, String status, String cpf, Address address) {
        this.idRegistration = idRegitration;
        this.name = name;
        this.birthDate = birthDate;
        this.status = status;
        this.cpf = cpf;
        this.address = address;
    }

    public void print(){
        System.out.println("ID: "+idRegistration);
        System.out.println("name: "+name);
        System.out.println("birthDate: "+birthDate);
        System.out.println("cpf: "+cpf);
        System.out.println("status: "+status);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
