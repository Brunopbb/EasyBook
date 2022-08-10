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
            Loan loan = new Loan(client.getIdClient(), book.getId(), LOCALDATE, LocalDate.parse("2022-09-09"));
            LOANREPOSITORY.setOneLoan(loan);
            LOANREPOSITORY.setLoanControl(LOANREPOSITORY.getLoanControl() + 1);
            book.setAmount(book.getAmount() - 1);
            return true;
        }

        return false;

    }

    public boolean returnBook(){

        //verificar se não está atrasado, se sim, gerar boleto (dias atrasados* valor padrao da multa)
        //tirar dos emprestimos
        //incrementar na quantidade do livro

        return false;
    }


    public LocalDate generateDataReturn(){
        return LOCALDATE.plusMonths(1);
    }


    public void showLoans(){

        if(LOANREPOSITORY.getLoans() != null){
            for(Loan loan: LOANREPOSITORY.getLoans()){

                if(loan != null){
                    System.out.println("---------------------");
                    loan.print();
                }
            }
        }

    }

}
