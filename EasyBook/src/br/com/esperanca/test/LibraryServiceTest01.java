package br.com.esperanca.test;

import br.com.esperanca.domain.model.Address;
import br.com.esperanca.domain.model.Book;
import br.com.esperanca.domain.model.Client;
import br.com.esperanca.domain.service.LibraryService;

public class LibraryServiceTest01 {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
//
//
        Address address = new Address("Rua 1", "58135000", "Esperanca", 40);
        Client client1 = new Client("idregistration", "Bruno Almeida", "02/02/1999", "A", "123456789", address);
        Client client2 = new Client("idregistration2", "Sabrina", "02/02/2000", "D", "1598753", address);
        Client client3 = new Client("idregistration3", "Maria", "02/02/1993", "A", "159877746", address);
//
        Book book1 = new Book("idbook1", "Sapiens", "1", "genero", "harari", 3);
        Book book2 = new Book("idbook2", "Codigo limpo", "3", "genero", "Robert", 1);
        Book book3 = new Book("idbook3", "como nao entrar na russia", "2", "genero", "Napoleao", 3);


//
        libraryService.cadastrationClient(client1);
        libraryService.cadastrationClient(client2);
        libraryService.cadastrationClient(client3);

        libraryService.cadastrationBook(book1);
        libraryService.cadastrationBook(book2);
        libraryService.cadastrationBook(book3);
//
        System.out.println(libraryService.makeALoan(client1, book2));
        System.out.println(libraryService.makeALoan(client3, book1));



        libraryService.generateMulct();



        libraryService.relatory();





//
//
//
    }

}
