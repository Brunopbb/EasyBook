package service;

import model.Client;
import repository.ClientRepository;
import service.enums.StatusClient;
import service.interfaces.ClientService;

public class ClientServiceIMPL implements ClientService {

    private final ClientRepository CLIENTREPOSITORY = new ClientRepository();




    @Override
    public boolean addClient(Client client) {
        int index = searchClient(client.getName());

        if(index == -1){
            CLIENTREPOSITORY.setOneClient(client);
            CLIENTREPOSITORY.setClientControl(CLIENTREPOSITORY.getClientControl() + 1);
            return true;
        }

        return false;


    }

    @Override
    public boolean removeClient(String name) {

        int index = searchClient(name);

        if(index == -1 || CLIENTREPOSITORY.getClient() == null || CLIENTREPOSITORY.getClient()[index].getStatusClient() != StatusClient.ACTIVE){
            return false;
        }

        for (int i = index; i < CLIENTREPOSITORY.getClientControl(); i++) {
            if(CLIENTREPOSITORY.getClient()[i] != null){
                CLIENTREPOSITORY.getClient()[i] = CLIENTREPOSITORY.getClient()[i + 1];
            }
        }
        return true;
    }

//    @Override
//    public boolean editClient(String name, Client client) {
//        int index = searchClient(name);
//        if(index == -1 || !clientRepository.getClient()[index].getName().equals(name)){
//            clientRepository.getClient()[index] = client;
//            return true;
//        }
//        return false;
//    }

    @Override
    public int searchClient(String name) {

        Client[] clients = CLIENTREPOSITORY.getClient();

        if(clients != null){
            for(int i = 0; i < CLIENTREPOSITORY.getClientControl(); i++){
                if(clients[i] != null && clients[i].getName().equalsIgnoreCase(name)){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void listClients() {

        if(CLIENTREPOSITORY.getClient() != null){
            for(Client client : CLIENTREPOSITORY.getClient()){
                if(client != null){

                    System.out.println("---------------");
                    client.print();
                }
            }
        }

    }
}
