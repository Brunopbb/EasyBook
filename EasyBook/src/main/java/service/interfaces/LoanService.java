package service.interfaces;

import model.Book;
import model.Client;

import java.time.LocalDate;


public interface LoanService {

    boolean makeALoan(Book book, Client client);

    boolean returnBook();
    void showLoans();
    LocalDate generateDataReturn();

}
