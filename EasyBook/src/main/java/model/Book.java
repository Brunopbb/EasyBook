package model;

public class Book{

    private String id;
    private String name;
    private String edition;
    private String genre;
    private String author;
    private int amount;


    public Book(String id, String name, int amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Book(String id, String name, String edition, String genre, String author, int amount) {
        this(id, name, amount);
        this.edition = edition;
        this.genre = genre;
        this.author = author;

    }

    public void print(){
        System.out.println("ID: "+id);
        System.out.println("name: "+name);
        System.out.println("edition: "+edition);
        System.out.println("genre: "+genre);
        System.out.println("author: "+author);
        System.out.println("amount: "+amount);
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
