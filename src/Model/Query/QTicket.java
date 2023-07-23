package Model.Query;

import Database.SQLConnection;
import Model.Entity.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QTicket implements QGeneric<Ticket>{

    private Connection connection;

    public QTicket() {
        connection = SQLConnection.openConnection();
    }

    @Override
    public void create(Ticket ticket) {
        try {
            String query = "INSERT INTO ticket (idTicket, idUser, idClient, idProgramming, description, " +
                    "destination, seat_number, created_at, travel_date, departure_time, money_type, " +
                    "price, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, ticket.getIdTicket());
            statement.setString(2, ticket.getIdUser());
            statement.setString(3, ticket.getIdClient());
            statement.setString(4, ticket.getIdProgramming());
            statement.setString(5, ticket.getDescription());
            statement.setString(6, ticket.getDestination());
            statement.setInt(7, ticket.getSeatNumber());
            statement.setTimestamp(8, new java.sql.Timestamp(ticket.getCreatedAt().getTime()));
            statement.setTimestamp(9, new java.sql.Timestamp(ticket.getTravelDate().getTime()));
            statement.setTimestamp(10, new java.sql.Timestamp(ticket.getDepartureTime().getTime()));
            statement.setString(11, ticket.getMoneyType());
            statement.setBigDecimal(12, ticket.getPrice());
            statement.setBoolean(13, ticket.isState());

            statement.executeUpdate();
            statement.close();

            System.out.println("Boleto creado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Ticket ticket) {
        try {
            String query = "UPDATE ticket SET idUser = ?, idClient = ?, idProgramming = ?, " +
                    "description = ?, destination = ?, seat_number = ?, created_at = ?, " +
                    "travel_date = ?, departure_time = ?, money_type = ?, price = ?, state = ? " +
                    "WHERE idTicket = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, ticket.getIdUser());
            statement.setString(2, ticket.getIdClient());
            statement.setString(3, ticket.getIdProgramming());
            statement.setString(4, ticket.getDescription());
            statement.setString(5, ticket.getDestination());
            statement.setInt(6, ticket.getSeatNumber());
            statement.setTimestamp(7, new java.sql.Timestamp(ticket.getCreatedAt().getTime()));
            statement.setTimestamp(8, new java.sql.Timestamp(ticket.getTravelDate().getTime()));
            statement.setTimestamp(9, new java.sql.Timestamp(ticket.getDepartureTime().getTime()));
            statement.setString(10, ticket.getMoneyType());
            statement.setBigDecimal(11, ticket.getPrice());
            statement.setBoolean(12, ticket.isState());
            statement.setString(13, ticket.getIdTicket());

            statement.executeUpdate();
            statement.close();

            System.out.println("Boleto actualizado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String idTicket) {
        try {
            String query = "DELETE FROM ticket WHERE idTicket = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idTicket);

            statement.executeUpdate();
            statement.close();

            System.out.println("Boleto eliminado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Ticket> getAll() {
        List<Ticket> tickets = new ArrayList<>();

        try {
            String query = "SELECT * FROM ticket";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Ticket ticket = extractFromResultSet(resultSet);
                tickets.add(ticket);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return tickets;
    }

    @Override
    public Ticket getById(String idTicket) {
        Ticket ticket = null;

        try {
            String query = "SELECT * FROM ticket WHERE idTicket = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idTicket);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                ticket = extractFromResultSet(resultSet);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return ticket;
    }

    private Ticket extractFromResultSet(ResultSet resultSet) throws SQLException {
        String idTicket = resultSet.getString("idTicket");
        String idUser = resultSet.getString("idUser");
        String idClient = resultSet.getString("idClient");
        String idProgramming = resultSet.getString("idProgramming");
        String description = resultSet.getString("description");
        String destination = resultSet.getString("destination");
        int seatNumber = resultSet.getInt("seat_number");
        java.sql.Timestamp createdAt = resultSet.getTimestamp("created_at");
        java.sql.Timestamp travelDate = resultSet.getTimestamp("travel_date");
        java.sql.Timestamp departureTime = resultSet.getTimestamp("departure_time");
        String moneyType = resultSet.getString("money_type");
        java.math.BigDecimal price = resultSet.getBigDecimal("price");
        boolean state = resultSet.getBoolean("state");

        return new Ticket(idTicket, idUser, idClient, idProgramming, description, destination, seatNumber,
                createdAt, travelDate, departureTime, moneyType, price, state);
    }
}
