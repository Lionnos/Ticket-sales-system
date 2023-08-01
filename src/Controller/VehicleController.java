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
            vehicle.setIdVehicle(id);
        }
        qVehicle.create(vehicle);
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
