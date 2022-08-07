package service.interfaces;

import model.Book;
import model.Client;



public interface LoanService {

    boolean makeALoan(Book book, Client client);
    void showLoans();

    String generateDataReturn();

    String  generateDataLoan();


}
