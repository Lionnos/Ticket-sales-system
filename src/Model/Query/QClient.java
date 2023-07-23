package Model.Query;

import Database.SQLConnection;
import Model.Entity.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QClient implements QGeneric<Client>{

    private Connection connection;

    public QClient() {
        connection = SQLConnection.openConnection();
    }

    @Override
    public void create(Client client) {
        try {
            String query = "INSERT INTO Tclient (idClient, first_name, last_name, document_type, " +
                           "document_number, ruc, business_name, gender, telephone, address) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, client.getIdClient());
            statement.setString(2, client.getFirstName());
            statement.setString(3, client.getLastName());
            statement.setString(4, client.getDocumentType());
            statement.setLong(5, client.getDocumentNumber());
            statement.setLong(6, client.getRuc());
            statement.setString(7, client.getBusinessName());
            statement.setBoolean(8, client.isGender());
            statement.setInt(9, client.getTelephone());
            statement.setString(10, client.getAddress());

            statement.executeUpdate();
            statement.close();

            System.out.println("Cliente creado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Client client) {
        try {
            String query = "UPDATE Tclient SET first_name = ?, last_name = ?, document_type = ?, " +
                           "document_number = ?, ruc = ?, business_name = ?, gender = ?, " +
                           "telephone = ?, address = ? WHERE idClient = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, client.getFirstName());
            statement.setString(2, client.getLastName());
            statement.setString(3, client.getDocumentType());
            statement.setLong(4, client.getDocumentNumber());
            statement.setLong(5, client.getRuc());
            statement.setString(6, client.getBusinessName());
            statement.setBoolean(7, client.isGender());
            statement.setInt(8, client.getTelephone());
            statement.setString(9, client.getAddress());
            statement.setString(10, client.getIdClient());

            statement.executeUpdate();
            statement.close();

            System.out.println("Cliente actualizado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String idClient) {
        try {
            String query = "DELETE FROM Tclient WHERE idClient = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idClient);

            statement.executeUpdate();
            statement.close();

            System.out.println("Cliente eliminado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        try {
            String query = "SELECT * FROM Tclient";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Client client = extractFromResultSet(resultSet);
                clients.add(client);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return clients;
    }

    @Override
    public Client getById(String idClient) {
        Client client = null;

        try {
            String query = "SELECT * FROM Tclient WHERE idClient = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idClient);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                client = extractFromResultSet(resultSet);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return client;
    }


    private Client extractFromResultSet(ResultSet resultSet) throws SQLException {
        String idClient = resultSet.getString("idClient");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        String documentType = resultSet.getString("document_type");
        long documentNumber = resultSet.getLong("document_number");
        long ruc = resultSet.getLong("ruc");
        String businessName = resultSet.getString("business_name");
        boolean gender = resultSet.getBoolean("gender");
        int telephone = resultSet.getInt("telephone");
        String address = resultSet.getString("address");

        return new Client(idClient, firstName, lastName, documentType, documentNumber,
                          ruc, businessName, gender, telephone, address);
    }
}

