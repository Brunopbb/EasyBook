package model;

public class Loan {

    private String idClient;
    private String idBook;
    private String date;
    private String returnDate;

    public Loan(String idClient, String idBook, String date, String returnDate) {
        this.idClient = idClient;
        this.idBook = idBook;
        this.date = date;
        this.returnDate = returnDate;
    }

    public void print(){
        System.out.println("idClient: "+idClient);
        System.out.println("idBook: "+idBook);
        System.out.println("date: "+date);
        System.out.println("returnDate: "+returnDate);
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }



}
