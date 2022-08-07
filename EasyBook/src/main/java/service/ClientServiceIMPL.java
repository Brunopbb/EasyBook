package service;

import model.Client;
import repository.ClientRepository;
import service.enums.StatusClient;
import service.interfaces.ClientService;

public class ClientServiceIMPL implements ClientService {

    private final ClientRepository CLIENTREPOSITORY = new ClientRepository();


    //implementar metodos

    @Override
    public boolean addClient(Client client) {
        int index = searchClient(client.getName());

        if(index == -1){
            CLIENTREPOSITORY.setOneClient(client);
            ClientRepository.setClientControl(ClientRepository.getClientControl() + 1);
            return true;
        }

        return false;


    }

    @Override
    public boolean removeClient(String name) {

        int index = searchClient(name);

        if(index == -1 || ClientRepository.getClient() == null || ClientRepository.getClient()[index].getStatusClient() != StatusClient.ACTIVE){
            return false;
        }

        for (int i = index; i < ClientRepository.getClientControl(); i++) {
            if(ClientRepository.getClient()[i] != null){
                ClientRepository.getClient()[i] = ClientRepository.getClient()[i + 1];
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

        Client[] clients = ClientRepository.getClient();

        if(clients != null){
            for(int i = 0; i < ClientRepository.getClientControl(); i++){
                if(clients[i] != null && clients[i].getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void listClients() {

        if(ClientRepository.getClient() != null){
            for(Client client : ClientRepository.getClient()){
                if(client != null){

                    System.out.println("---------------");
                    client.print();
                }
            }
        }

    }
}
