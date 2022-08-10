package service;


import model.Loan;
import repository.LoanRepository;
import repository.MulctRepository;
import service.interfaces.MulctService;

public class MulctServiceIMPL implements MulctService {

    private final MulctRepository MULCTREPOSITORY = new MulctRepository();
    private final LoanRepository LOANREPOSITORY = new LoanRepository();


    @Override
    public void generateMulct() {

    }

    @Override
    public String[] getClientsIdWithLate() {

        Loan[] loans = LOANREPOSITORY.getLoans();
        String[] clientsIdWithLate = new String[LOANREPOSITORY.getLoanControl()];

        if(loans != null){
            for(int i = 0; i < LOANREPOSITORY.getLoanControl(); i++){
                if(loans[i].getReturnDate().getDayOfMonth() >= loans[i].getDate().getDayOfMonth() &&
                    loans[i].getReturnDate().getMonth().getValue() == loans[i].getDate().getMonth().plus(1).getValue()){

                    clientsIdWithLate[i] = loans[i].getIdClient();

                }
            }
        }
        return clientsIdWithLate;

    }

    @Override
    public void showMulcts() {

    }
}
