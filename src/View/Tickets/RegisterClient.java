package View.Tickets;

import Controller.ClientController;
import IDGenerator.IDGenerator;
import Model.Entity.Client;


public class RegisterClient {
    public static String idClient;
    public static String firstName;
    public static String lastName;
    public static String documentType;
    public static Long documentNumber;
    public static Long ruc; 
    public static String businessName = null;
    public static String gender;
    public static int telephone;
    public static String address = null;

    public static void save(){
        idClient = IDGenerator.generateCustomID();
        ClientController ClientController = new Controller.ClientController();
        Client client = new Client();

        client.setIdClient(idClient);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setDocumentType(documentType);
        client.setDocumentNumber(documentNumber);
        client.setRuc(ruc);
        client.setBusinessName(businessName);
        client.setGender(genero(gender));
        client.setTelephone(telephone);
        client.setAddress(address);

        ClientController.create(client);
        client = null;
        ClientController = null;
    }

    private static boolean genero(String data) {
        if (data.equals("Masculino")) {
            return true;
        } else {
            return false;
        }
    }
}
