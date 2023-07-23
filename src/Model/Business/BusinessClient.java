package Model.Business;

import Model.Entity.Client;
import Model.Query.QClient;
import Model.Query.QGeneric;

import java.util.List;

public class BusinessClient {

    private QGeneric<Client> qClient;

    public BusinessClient() {
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
        List<Client> clients = qClient.getAll();

        // Recorrer la lista de clientes y asignar el RUC correspondiente a cada uno
        for (Client client : clients) {
            // Obtener el RUC desde el cliente
            Long ruc = client.getRuc();
    
            // Verificar si el RUC es nulo y asignar un valor predeterminado si es así
            if (ruc == 0) { // nulll lo toma como 0
                ruc = 234245243L;
                client.setRuc(ruc);
            }
        }
    
        return clients;
    }

    public Client getById(String idClient) {
        return qClient.getById(idClient);
    }
}
