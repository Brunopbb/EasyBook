package br.com.esperanca.domain.model;

public class Book {

    private String id;
    private String name;
    private String edition;
    private String genre;
    private String author;
    private int amount;

    public Book() {

    }

    public Book(String id, String name, String edition, String genre, String author, int amount) {
        this.id = id;
        this.name = name;
        this.edition = edition;
        this.genre = genre;
        this.author = author;

        this.amount = amount;
    }

    public void print(){
        System.out.println("-------------------");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Edition: "+edition);
        System.out.println("Genre: "+genre);
        System.out.println("Author: "+author);
        System.out.println("Amount: "+amount);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
