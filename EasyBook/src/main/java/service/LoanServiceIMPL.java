package service;

import model.Book;
import model.Client;
import model.Loan;
import repository.LoanRepository;
import service.enums.StatusClient;
import service.interfaces.LoanService;

import java.util.Calendar;

public class LoanServiceIMPL implements LoanService {

    private final LoanRepository LOANREPOSITORY = new LoanRepository();
    private final Calendar DATE = Calendar.getInstance();

    public boolean makeALoan(Book book, Client client){

        if(book.getAmount() > 1 && client.getStatusClient() == StatusClient.ACTIVE){
            Loan loan = new Loan(client.getIdClient(), book.getId(), generateDataLoan(), generateDataReturn());
            LOANREPOSITORY.setOneLoan(loan);
            LoanRepository.setLoanControl(LoanRepository.getLoanControl() + 1);
            return true;
        }

        return false;

    }

    @Override
    public String generateDataLoan() {
        return DATE.get(Calendar.DAY_OF_MONTH)+"/"+ DATE.get(Calendar.MONTH)+"/"+ DATE.get(Calendar.YEAR);
    }

    public String generateDataReturn(){
        int month = DATE.get(Calendar.MONTH) + 1;
        return DATE.get(Calendar.DAY_OF_MONTH)+"/"+month+"/"+ DATE.get(Calendar.YEAR);
    }



    public void showLoans(){

        if(LOANREPOSITORY.getLoans() != null){
            for(Loan loan: LOANREPOSITORY.getLoans()){
                if(loan != null){

                    loan.print();
                }
            }
        }

    }

}
