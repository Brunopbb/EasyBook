package service.interfaces;

import model.Book;

public interface BookService {

    boolean addBook(Book book);
    boolean removeBook(String name, int amount);

    int searchBook(String name);

    void listBooks();










}
