package repository;

import model.Loan;

public class LoanRepository {

    private Loan[] loans = new Loan[100];
    private int loanControl;



    public void setOneLoan(Loan loan){
        this.loans[loanControl] = loan;
    }


    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public int getLoanControl() {
        return loanControl;
    }

    public void setLoanControl(int loanControl) {
        this.loanControl = loanControl;
    }
}
