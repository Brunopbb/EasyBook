package test;

import model.Address;
import model.Book;
import model.Client;
import repository.BookRepository;
import repository.ClientRepository;
import service.LoanServiceIMPL;
import service.enums.StatusClient;
import service.interfaces.LoanService;

public class LoanTest {
    public static void main(String[] args) {

        BookTest.main(new String[]{});
        ClientTest.main(new String[]{});

        LoanService loanService = new LoanServiceIMPL();

        loanService.makeALoan(BookRepository.getBooks()[0], ClientRepository.getClient()[0]);

        loanService.showLoans();


    }
}
