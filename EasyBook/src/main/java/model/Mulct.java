package model;

public class Mulct {

    private String idCLient;
    private String idBook;
    private static final double VALUE;


    static {
        VALUE = 1.0;
    }

    public Mulct(String idCLient, String idBook) {
        this.idCLient = idCLient;
        this.idBook = idBook;
    }

    public String getIdCLient() {
        return idCLient;
    }

    public void setIdCLient(String idCLient) {
        this.idCLient = idCLient;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }
}
