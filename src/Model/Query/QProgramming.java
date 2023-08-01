package Model.Query;

import Database.SQLConnection;
import Model.Entity.Programming;
import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QProgramming implements QGeneric<Programming> {

    private Connection connection;

    public QProgramming() {
        connection = SQLConnection.openConnection();
    }

    @Override
    public void create(Programming programming) {
        try {
            String query = "INSERT INTO Tprogramming (idProgramming, idVehicle, origin, destination, " +
                    "programming_date, programming_hour, total_cost, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, programming.getIdProgramming());
            statement.setString(2, programming.getIdVehicle());
            statement.setString(3, programming.getOrigin());
            statement.setString(4, programming.getDestination());
            statement.setDate(5, programming.getProgrammingDate());
            statement.setTime(6, programming.getProgrammingHour());
            statement.setBigDecimal(7, programming.getTotalCost());
            statement.setBoolean(8, programming.isState());

            statement.executeUpdate();
            statement.close();

            System.out.println("Programación creada exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Programming programming) {
        try {
            String query = "UPDATE Tprogramming SET idVehicle = ?, origin = ?, destination = ?, " +
                    "programming_date = ?, programming_hour = ?, total_cost = ?, state = ? " +
                    "WHERE idProgramming = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, programming.getIdVehicle());
            statement.setString(2, programming.getOrigin());
            statement.setString(3, programming.getDestination());
            statement.setDate(4, programming.getProgrammingDate());
            statement.setTime(5, programming.getProgrammingHour());
            statement.setBigDecimal(6, programming.getTotalCost());
            statement.setBoolean(7, programming.isState());
            statement.setString(8, programming.getIdProgramming());

            statement.executeUpdate();
            statement.close();

            System.out.println("Programación actualizada exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String idProgramming) {
        try {
            String query = "DELETE FROM Tprogramming WHERE idProgramming = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idProgramming);

            statement.executeUpdate();
            statement.close();

            System.out.println("Programación eliminada exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Programming> getAll() {
        List<Programming> programmings = new ArrayList<>();

        try {
            String query = "SELECT * FROM Tprogramming";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Programming programming = extractFromResultSet(resultSet);
                programmings.add(programming);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return programmings;
    }

    @Override
    public Programming getById(String idProgramming) {
        Programming programming = null;

        try {
            String query = "SELECT * FROM Tprogramming WHERE idProgramming = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idProgramming);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                programming = extractFromResultSet(resultSet);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return programming;
    }

    private Programming extractFromResultSet(ResultSet resultSet) throws SQLException {
        String idProgramming = resultSet.getString("idProgramming");
        String idVehicle = resultSet.getString("idVehicle");
        String origin = resultSet.getString("origin");
        String destination = resultSet.getString("destination");
        java.sql.Date programmingDate = resultSet.getDate("programming_date");
        java.sql.Time programmingHour = resultSet.getTime("programming_hour");
        BigDecimal totalCost = resultSet.getBigDecimal("total_cost");
        boolean state = resultSet.getBoolean("state");

        return new Programming(idProgramming, idVehicle, origin, destination,
                programmingDate, programmingHour, totalCost, state);
    }
}
