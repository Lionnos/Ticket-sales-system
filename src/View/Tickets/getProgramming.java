package View.Tickets;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import Controller.ProgrammingController;
import Controller.VehicleController;
import Database.SQLConnection;
import Model.Entity.Programming;
import Model.Entity.Vehicle;

public class getProgramming {

    public static List<String> idProgrammingList = new ArrayList<>();    
    //public static List<String> originList = new ArrayList<>();
    public static List<String> destinationList = new ArrayList<>();
    public static List<Date> dateList = new ArrayList<>();
    public static List<Time> hourList = new ArrayList<>();

    String placa;
    String model;
    
    public getProgramming() {
    }

    public static void getIdProgramming(){
        ProgrammingController programmingController = new ProgrammingController();
        List<Programming> programmings = programmingController.getAll();
        for (Programming programming : programmings) {
            if(programming.isState() == true){
                idProgrammingList.add(programming.getIdProgramming());
                //originList.add(programming.getOrigin());
                destinationList.add(programming.getDestination());
                dateList.add(programming.getProgrammingDate());
                hourList.add(programming.getProgrammingHour());
            }
        }
        programmingController = null;
    }

    private void getVehicleByIdProgramming(String idProgramming) {
        ProgrammingController programmingController = new ProgrammingController();
        VehicleController vehicleController = new VehicleController();
        Programming programming = programmingController.getById(idProgramming);

        if (programming != null) {
            String idVehicle = programming.getIdVehicle();
            Vehicle vehicle = vehicleController.getById(idVehicle);
            if (vehicle != null) {
                placa = vehicle.getPlate();
                model = vehicle.getModel();
            }
        }
    }

    public static List<Integer> getSeatNumbersByProgrammingId(String idProgramming) {
        Connection connection = SQLConnection.openConnection();
        List<Integer> seatNumbers = null;
        seatNumbers = new ArrayList<>();
    
        try {
            String query = "SELECT seat_number FROM Tticket WHERE idProgramming = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idProgramming);
    
            ResultSet resultSet = statement.executeQuery();
    
            while (resultSet.next()) {
                int seatNumber = resultSet.getInt("seat_number");
                seatNumbers.add(seatNumber);
            }
    
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
        return seatNumbers;
    }
}
