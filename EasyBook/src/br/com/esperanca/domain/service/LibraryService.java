package br.com.esperanca.domain.service;

import java.util.Calendar;

import br.com.esperanca.domain.Enums.StatusClient;
import br.com.esperanca.domain.model.*;

public class LibraryService {

    private Book[] books;
    private Employee[] employees;
    private Client[] clients;
    private Loan[] loans;

    private Mulct[] mulcts;

    private Calendar date;

    private static int controlEmployee;
    private static int controlClient;
    private static int controlBook;
    private static int controlLoan;
    private static int controlMulct;


    {
        controlEmployee = 0;
        controlClient = 0;
        controlBook = 0;
        controlLoan = 0;
        controlMulct = 0;
        books = new Book[100];
        employees = new Employee[10];
        clients = new Client[100];
        loans = new Loan[100];
        mulcts = new Mulct[100];
        date = Calendar.getInstance();

    }

    public LibraryService(){

    }


    public void cadastrationEmployee(Employee employee){
        this.employees[controlEmployee] = employee;
        controlEmployee++;
    }

    public void cadastrationBook(Book book){

        this.books[controlBook] = book;
        controlBook++;

    }

    public void cadastrationClient(Client client){

        this.clients[controlClient] = client;
        controlClient++;

    }

    private Client searchClient(String name){

        if(clients != null){
            for(Client client : clients){
                if(client.getName().equals(name)){
                    return client;
                }
            }
        }

        return null;

    }

    private boolean clientVerification(String name){
        Client client = searchClient(name);
        return client != null && client.getStatus().equals(StatusClient.ACTIVE);
    }

    private Book searchBook(String name){
        if(books != null){
            for(Book book : books){
                if(book != null && book.getName().equals(name)){
                    return book;
                }
            }
        }
        return null;
    }

    private boolean bookVerification(String name){
        Book book = searchBook(name);
        return book != null && book.getAmount() >= 0;
    }

    public boolean makeALoan(Client client, Book book){
        if(clientVerification(client.getName()) && bookVerification(book.getName())){
            loans[controlLoan] = new Loan(client.getIdRegistration(), book.getId(), generateDateLoan() , generateReturnDate());
            book.setAmount(book.getAmount()-1);
            controlLoan++;
            return true;
        }

        return false;
    }

    private String generateDateLoan(){
        return (date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR));
    }

    private String generateReturnDate(){
        int month = date.get(Calendar.MONTH) + 1;
        return (date.get(Calendar.DAY_OF_MONTH)+"/"+month+"/"+date.get(Calendar.YEAR));
    }

    public void mulctManagement(){



    }

    public void generateMulct(){
        String[] idsClient = getIdClientWithReturnDateInvalid();
        System.out.println(idsClient.length);
        for(String ids : idsClient){
            if(ids != null) {
                mulcts[controlMulct] = new Mulct(ids);
                changeStatus(ids);
                controlMulct++;
            }else {
                break;
            }

        }


    }

    private void changeStatus(String idClient){

        if(clients != null){
            for(Client client : clients){
                if(client != null && client.getIdRegistration().equals(idClient)){
                    client.setStatus(StatusClient.WITH_MULCT);
                }
            }
        }

    }

    public String[] getIdClientWithReturnDateInvalid(){

        String[] idsClients = new String[controlLoan];

        for(int i = 0; i < controlLoan; i++){

            int day = Integer.parseInt(loans[i].getReturnDate().split("/")[0]);
            int month = Integer.parseInt(loans[i].getReturnDate().split("/")[1]);
            if (day > date.get(Calendar.DAY_OF_WEEK) && month > date.get(Calendar.MONTH)) {

                idsClients[i] = loans[i].getIdClient();

            }
        }


        return idsClients;

    }





    public void relatory(){
        System.out.println("--------Livros--------");
        for(Book book : books){

            if(book != null) {
                System.out.println("----------------");
                book.print();
            }
        }
        System.out.println("--------Clientes--------");
        for(Client client : clients){
            if(client != null) {
                System.out.println("----------------");
                client.print();
            }
        }
        System.out.println("--------Emprestimos--------");
        for (Loan loan : loans){
            if(loan != null) {
                System.out.println("----------------");
                loan.print();
            }
        }

        System.out.println("--------Multas--------");
        for(Mulct mulct : mulcts){
            if(mulct != null) {
                System.out.println("----------------");
                mulct.print();
            }else{
                break;
            }
        }



    }








}
