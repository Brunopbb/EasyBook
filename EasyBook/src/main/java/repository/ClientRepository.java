package repository;

import model.Client;

public class ClientRepository {

    private static Client[] client = new Client[100];
    private static int  clientControl;


    public void setOneClient(Client client){
        ClientRepository.client[clientControl] = client;
    }

    public static Client[] getClient() {
        return client;
    }

    public void setClient(Client[] client) {
        ClientRepository.client = client;
    }

    public static int getClientControl() {
        return clientControl;
    }

    public static void setClientControl(int clientControl) {
        ClientRepository.clientControl = clientControl;
    }
}
