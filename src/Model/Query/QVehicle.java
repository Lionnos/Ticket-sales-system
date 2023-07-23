package Model.Query;

import Database.SQLConnection;
import Model.Entity.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QVehicle implements QGeneric<Vehicle>{

    private Connection connection;

    public QVehicle() {
        connection = SQLConnection.openConnection();
    }

    @Override
    public void create(Vehicle vehicle) {
        try {
            String query = "INSERT INTO Tvehicle (idVehicle, description, plate, model, seat_numbers, state) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
    
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, vehicle.getIdVehicle());
            statement.setString(2, vehicle.getDescription());
            statement.setString(3, vehicle.getPlate());
            statement.setString(4, vehicle.getModel());
            statement.setInt(5, vehicle.getSeatNumbers());
            statement.setBoolean(6, vehicle.isState());

            statement.executeUpdate();
            statement.close();
    
            System.out.println("Vehículo creado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void update(Vehicle vehicle) {
        try {
            String query = "UPDATE Tvehicle SET description = ?, plate = ?, model = ?, " +
                    "seat_numbers = ?, state = ? WHERE idVehicle = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, vehicle.getDescription());
            statement.setString(2, vehicle.getPlate());
            statement.setString(3, vehicle.getModel());
            statement.setInt(4, vehicle.getSeatNumbers());
            statement.setBoolean(5, vehicle.isState());
            statement.setString(6, vehicle.getIdVehicle());

            statement.executeUpdate();
            statement.close();

            System.out.println("Vehículo actualizado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String idVehicle) {
        try {
            String query = "DELETE FROM Tvehicle WHERE idVehicle = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idVehicle);

            statement.executeUpdate();
            statement.close();

            System.out.println("Vehículo eliminado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = new ArrayList<>();

        try {
            String query = "SELECT * FROM Tvehicle";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Vehicle vehicle = extractFromResultSet(resultSet);
                vehicles.add(vehicle);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return vehicles;
    }

    @Override
    public Vehicle getById(String idVehicle) {
        Vehicle vehicle = null;

        try {
            String query = "SELECT * FROM Tvehicle WHERE idVehicle = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idVehicle);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                vehicle = extractFromResultSet(resultSet);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return vehicle;
    }

    private Vehicle extractFromResultSet(ResultSet resultSet) throws SQLException {
        String idVehicle = resultSet.getString("idVehicle");
        String description = resultSet.getString("description");
        String plate = resultSet.getString("plate");
        String model = resultSet.getString("model");
        int seatNumbers = resultSet.getInt("seat_numbers");
        boolean state = resultSet.getBoolean("state");

        return new Vehicle(idVehicle, description, plate, model, seatNumbers, state);
    }
}
