package Controller;

import Model.Business.BusinessClient;
import Model.Entity.Client;

import java.util.List;

public class ControllerClient {

    private BusinessClient businessClient;

    public ControllerClient() {
        businessClient = new BusinessClient();
    }

    public void create(Client client) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de crear el cliente
        businessClient.create(client);
    }

    public void update(Client client) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de actualizar el cliente
        businessClient.update(client);
    }

    public void delete(String idClient) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de eliminar el cliente
        businessClient.delete(idClient);
    }

    public List<Client> getAll() {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de obtener todos los clientes
        return businessClient.getAll();
    }

    public Client getById(String idClient) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de obtener un cliente por su ID
        return businessClient.getById(idClient);
    }

 

    public static void main(String[] args) {
        
        ControllerClient controllerClient = new ControllerClient();
        List<Client> clients = controllerClient.getAll();
        if (clients.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Client client : clients) {
                System.out.println(client);
            }
        }

        ControllerClient a = new ControllerClient();
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

        // Llamar al método create() del BusinessClient para insertar el cliente
        businessClient.create(newClient);

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

        // Llamar al método create() del BusinessClient para insertar el cliente
        businessClient.update(newClient);

        System.out.println("Cliente actualizado.");
    }
}
