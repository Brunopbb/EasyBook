package service;

import model.Book;
import repository.BookRepository;
import service.interfaces.BookService;

public class BookServiceIMPL implements BookService {

    private final BookRepository BOOKREPOSITORY = new BookRepository();


    public boolean addBook(Book book){

        int index = searchBook(book.getName());

        if(index == -1){
            BOOKREPOSITORY.setOneBooks(book);
            BookRepository.setBookControl(BookRepository.getBookControl()+1);

        }else{

            BookRepository.getBooks()[index].setAmount(BookRepository.getBooks()[index].getAmount() + book.getAmount());


        }

        return true;


    }

    public int searchBook(String name){
        if(BookRepository.getBooks() != null){
            for(int i = 0; i < BookRepository.getBookControl(); i++){
                if(BookRepository.getBooks()[i] != null && BookRepository.getBooks()[i].getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }

    public void listBooks(){

        if(BookRepository.getBooks() != null){
            for(int i = 0; i < BookRepository.getBookControl(); i++){
                if(BookRepository.getBooks()[i] != null){
                    System.out.println("------------------------");
                    BookRepository.getBooks()[i].print();
                }
            }
        }
    }

    public boolean removeBook(String name, int amount){

        int index = searchBook(name);
        Book[] books = BookRepository.getBooks();

        if (index != -1) {
            if (books[index].getAmount() >= 1) {
                if (amount < books[index].getAmount()) {
                    books[index].setAmount(books[index].getAmount() - amount);
                    return true;
                } else if (amount == books[index].getAmount()) {
                    for (int i = index; i < BookRepository.getBookControl(); i++) {
                        books[i] = books[i + 1];
                    }

                }

                BOOKREPOSITORY.setBooks(books);
                return true;
            }

        }
        return false;

    }

}
