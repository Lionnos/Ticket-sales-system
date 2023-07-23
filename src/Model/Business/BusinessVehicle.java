package Model.Business;

import java.util.List;

import Model.Entity.Vehicle;
import Model.Query.QGeneric;
import Model.Query.QVehicle;

public class BusinessVehicle {
    private QGeneric<Vehicle> qVehicle;

    public BusinessVehicle () {
        qVehicle = new QVehicle();
    }

    
    public void create(Vehicle vehicle) {
        //
        qVehicle.create(vehicle);
    }

    public void update(Vehicle vehicle) {
        //
        qVehicle.update(vehicle);
    }

    public void delete(String idVehicle) {
        //
        qVehicle.delete(idVehicle);
    }

    public List<Vehicle> getAll() {
        //
        return qVehicle.getAll();
    }

    public Vehicle getById(String idVehicle) {
        //
        return qVehicle.getById(idVehicle);
    }
}
