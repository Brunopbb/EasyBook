package test;

import model.Address;
import model.Book;
import model.Client;
import repository.BookRepository;
import repository.ClientRepository;
import service.BookServiceIMPL;
import service.ClientServiceIMPL;
import service.LoanServiceIMPL;
import service.enums.StatusClient;
import service.interfaces.BookService;
import service.interfaces.ClientService;
import service.interfaces.LoanService;

public class LoanTest {
    public static void main(String[] args) {

        ClientService clientService = new ClientServiceIMPL();
        Address address = new Address("Jose bonifacio", "Esperanca", "58135000", 40);

        Client client1 = new Client("idclient1", "bruno", "02/02/1999", StatusClient.ACTIVE, "12689070499", address);
        Client client2 = new Client("idclient2", "Maria", "30/09/2000", StatusClient.ACTIVE, "15987531123", address);

        clientService.addClient(client1);
        clientService.addClient(client2);



        BookService bookServiceIMPL = new BookServiceIMPL();

//
        Book book1 = new Book("idbook1", "Sapiens", "1", "historia", "harari", 1);
        Book book4 = new Book("idbook1", "Sapiens", "1", "historia", "harari", 1);
        Book book5 = new Book("idbook5", "50 tons de cinza", "1", "historia", "harari", 1);
        Book book2 = new Book("idbook2", "clean code", "3", "programacao", "robert", 1);
        Book book3 = new Book("idbook3", "clean code", "3", "programacao", "robert", 1);
//
        bookServiceIMPL.addBook(book1);
        bookServiceIMPL.addBook(book2);
        bookServiceIMPL.addBook(book3);
        bookServiceIMPL.addBook(book4);
        bookServiceIMPL.addBook(book5);

        LoanService loanService = new LoanServiceIMPL();

        bookServiceIMPL.listBooks();

        loanService.makeALoan(book1, client1);
        loanService.makeALoan(book2, client2);

        loanService.showLoans();

        bookServiceIMPL.listBooks();







    }
}
