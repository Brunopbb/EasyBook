package service.interfaces;

import model.Client;

public interface ClientService {

    boolean addClient(Client client);
    boolean removeClient(String name);
    //boolean editClient(String name, Client client);
    int searchClient(String name);
    void listClients();

}
