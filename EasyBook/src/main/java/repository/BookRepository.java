package repository;

import model.Book;

public class BookRepository {

    private Book[] books = new Book[100];
    private int bookControl;

    public void setOneBooks(Book book) {
        this.books[bookControl] = book;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books){
        this.books = books;
    }

    public int getBookControl() {
        return bookControl;
    }

    public void setBookControl(int bookControl) {
        this.bookControl = bookControl;
    }
}
