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

 

    public static void main(String[] args) {
        
        ClientController controllerClient = new ClientController();
        List<Client> clients = controllerClient.getAll();
        if (clients.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Client client : clients) {
                System.out.println(client);
            }
        }

        ClientController a = new ClientController();
        a.updateClient();
    }

    /*
    public void insertClient() {
        // Crear un objeto Client con los datos que deseas insertar
        Client newClient = new Client(
            "1a2b3c4d-5e6f-7g8h-9i10j11k12S", // idClient
            "Henry", // firstName
            "Doe", // lastName
            "DNI", // documentType
            123456789012325L, // documentNumber
            0L, // ruc, puedes ponerlo como null
            "", // businessName, puedes ponerlo como null
            true, // gender, ejemplo de género masculino (true), puedes cambiarlo según tus necesidades
            987654431, // telephone, ejemplo de número de teléfono de 9 dígitos
            "123 Main St" // address
        );

        // Llamar al método create() del qClient para insertar el cliente
        qClient.create(newClient);

        System.out.println("Cliente insertado exitosamente.");
    }*/

    public void updateClient() {
        // Crear un objeto Client con los datos que deseas insertar
        Client newClient = new Client(
            "1a2b3c4d-5e6f-7g8h-9i10j11k12S", // idClient
            "Max", // firstName
            "Chichas", // lastName
            "DNI", // documentType
            12389012325L, // documentNumber
            0L, // ruc, puedes ponerlo como null
            "Software Lionos", // businessName, puedes ponerlo como null
            true, // gender, ejemplo de género masculino (true), puedes cambiarlo según tus necesidades
            930719613, // telephone, ejemplo de número de teléfono de 9 dígitos
            "123 Main St" // address
        );

        // Llamar al método create() del qClient para insertar el cliente
        qClient.update(newClient);

        System.out.println("Cliente actualizado.");
    }
}
