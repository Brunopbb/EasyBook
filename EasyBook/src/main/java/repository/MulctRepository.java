package repository;

import model.Mulct;

public class MulctRepository {

    private Mulct[] mulcts = new Mulct[100];

    private int mulctsControl;


    public Mulct[] getMulcts() {
        return mulcts;
    }

    public void setMulcts(Mulct[] mulcts) {
        this.mulcts = mulcts;
    }

    public int getMulctsControl() {
        return mulctsControl;
    }

    public void setMulctsControl(int mulctsControl) {
        this.mulctsControl = mulctsControl;
    }
}
