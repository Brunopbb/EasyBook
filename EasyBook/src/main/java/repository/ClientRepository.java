package repository;

import model.Client;

public class ClientRepository {

    private Client[] client = new Client[100];
    private int  clientControl;


    public void setOneClient(Client client){
        this.client[clientControl] = client;
    }

    public Client[] getClient() {
        return client;
    }

    public void setClient(Client[] client) {
        this.client = client;
    }

    public int getClientControl() {
        return clientControl;
    }

    public void setClientControl(int clientControl) {
        this.clientControl = clientControl;
    }
}
