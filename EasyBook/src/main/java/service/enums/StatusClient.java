package service.enums;

public enum StatusClient {

    ACTIVE(1),
    DISABLE(0),
    WITH_MULCT(-1);

    private final int VALUE;

    StatusClient(int value){
        this.VALUE = value;
    }


}
