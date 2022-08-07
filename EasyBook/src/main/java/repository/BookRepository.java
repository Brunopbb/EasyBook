package repository;

import model.Book;

public class BookRepository {

    private static Book[] books = new Book[100];
    private static int bookControl;

    public void setOneBooks(Book book) {
        BookRepository.books[bookControl] = book;
    }

    public static Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books){
        BookRepository.books = books;
    }

    public static int getBookControl() {
        return bookControl;
    }

    public static void setBookControl(int bookControl) {
        BookRepository.bookControl = bookControl;
    }
}
