package Controller;

import Model.Entity.Vehicle;
import Model.Query.QGeneric;
import Model.Query.QVehicle;

import java.util.List;

import IDGenerator.IDGenerator;

public class VehicleController {

    private QGeneric<Vehicle> qVehicle;

    public VehicleController() {
        qVehicle = new QVehicle();
    }

    public void create(Vehicle vehicle) {

        String id = IDGenerator.generateCustomID();

        if (vehicle.getIdVehicle() == null || vehicle.getIdVehicle().isEmpty()) {
            List<Vehicle> existingVehicles = qVehicle.getAll();
            boolean isIdUnique = true;
            
            // Bucle while para generar IDs hasta que se encuentre una única
            while (!isIdUnique) {
                for (Vehicle existingVehicle : existingVehicles) {
                    if (existingVehicle.getIdVehicle().equals(id)) {
                        isIdUnique = false;
                        id = IDGenerator.generateCustomID(); // Generar una nueva ID
                        break;
                    }
                }
                
                // Si aún no se encuentra una ID única, generamos otra
                if (!isIdUnique) {
                    id = IDGenerator.generateCustomID();
                }
            }
            
            // Asignar la ID generada única al vehículo y crearlo
            vehicle.setIdVehicle(id);
            qVehicle.create(vehicle);
        }
    }

    public void update(Vehicle vehicle) {
        qVehicle.update(vehicle);
    }

    public void delete(String idVehicle) {
        qVehicle.delete(idVehicle);
    }

    public List<Vehicle> getAll() {

        return qVehicle.getAll();
    }

    public Vehicle getById(String idVehicle) {
        return qVehicle.getById(idVehicle);
    }
}
