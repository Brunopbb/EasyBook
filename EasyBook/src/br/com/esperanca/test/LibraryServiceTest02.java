package br.com.esperanca.test;

import br.com.esperanca.domain.Enums.EmployeeType;
import br.com.esperanca.domain.model.Book;
import br.com.esperanca.domain.model.Employee;
import br.com.esperanca.domain.service.LibraryService;

public class LibraryServiceTest02 {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        Book book1 = new Book("bookid", "Sapiens", "1", "Historia", "Harari", 1);
        Book book2 = new Book("bookid", "Sapiens", "1", "Historia", "Harari", 2);
        Book book3 = new Book("bookid", "Sapiens", "1", "Historia", "Harari", 2);

        libraryService.cadastrationBook(book1);



        libraryService.cadastrationBook(book2);
        libraryService.cadastrationBook(book3);

        libraryService.relatory();



    }
}
