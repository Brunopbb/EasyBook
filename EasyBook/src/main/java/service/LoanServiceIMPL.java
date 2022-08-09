package service;

import model.Book;
import model.Client;
import model.Loan;
import repository.LoanRepository;
import service.enums.StatusClient;
import service.interfaces.LoanService;



import java.time.LocalDate;
import java.time.ZoneId;

public class LoanServiceIMPL implements LoanService {

    private final LoanRepository LOANREPOSITORY = new LoanRepository();


    private final LocalDate LOCALDATE = LocalDate.now(ZoneId.systemDefault());

    public boolean makeALoan(Book book, Client client){

        if(book.getAmount() > 1 && client.getStatusClient() == StatusClient.ACTIVE){
            Loan loan = new Loan(client.getIdClient(), book.getId(), LOCALDATE, generateDataReturn());
            LOANREPOSITORY.setOneLoan(loan);
            LoanRepository.setLoanControl(LoanRepository.getLoanControl() + 1);
            return true;
        }

        return false;

    }


    public LocalDate generateDataReturn(){

        return LOCALDATE.plusMonths(1);
    }


    public void showLoans(){

        if(LoanRepository.getLoans() != null){
            for(Loan loan: LoanRepository.getLoans()){
                if(loan != null){

                    loan.print();
                }
            }
        }

    }

}
