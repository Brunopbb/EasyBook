package br.com.esperanca.domain.model;

public class Mulct {

    private String idClient;
    private static final double VALUE = 1.0;



    public Mulct() {


    }

    public Mulct(String idClient) {
        this.idClient = idClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public double getValue() {
        return VALUE;
    }


    public void print(){
        System.out.println("idClient: "+idClient);
        System.out.println("Value: "+VALUE);

    }


}
