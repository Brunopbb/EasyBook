package repository;

import model.Loan;

public class LoanRepository {

    private static Loan[] loans = new Loan[100];
    private static int loanControl;



    public void setOneLoan(Loan loan){
        LoanRepository.loans[loanControl] = loan;
    }


    public static Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        LoanRepository.loans = loans;
    }

    public static int getLoanControl() {
        return loanControl;
    }

    public static void setLoanControl(int loanControl) {
        LoanRepository.loanControl = loanControl;
    }
}
