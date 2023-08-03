package Controller;

import Model.Entity.Client;
import Model.Query.QClient;
import Model.Query.QGeneric;

import java.util.List;

public class ClientController {

    private QGeneric<Client> qClient;

    public ClientController() {
        qClient = new QClient();
    }

    public void create(Client client) {
        qClient.create(client);
    }

    public void update(Client client) {
        qClient.update(client);
    }

    public void delete(String idClient) {
        qClient.delete(idClient);
    }

    public List<Client> getAll() {
        return qClient.getAll();
    }

    public Client getById(String idClient) {
        return qClient.getById(idClient);
    }
}
