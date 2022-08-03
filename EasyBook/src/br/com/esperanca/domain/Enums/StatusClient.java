package br.com.esperanca.domain.Enums;

public enum StatusClient {

    ACTIVE(0),
    DISABLE(1),
    WITH_MULCT(2);


    public final int NUM;

    StatusClient(int num){
        this.NUM = num;
    }



}
