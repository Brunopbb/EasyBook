package model;

import java.time.LocalDate;

public class Loan {

    private String idClient;
    private String idBook;
    private LocalDate date;
    private LocalDate returnDate;

    public Loan(String idClient, String idBook, LocalDate date, LocalDate returnDate) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }



}
