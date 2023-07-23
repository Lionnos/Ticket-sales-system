package Controller;

import Model.Business.BusinessVehicle;
import Model.Entity.Vehicle;

import java.util.List;

public class ControllerVehicle {

    private BusinessVehicle businessVehicle;

    public ControllerVehicle() {
        businessVehicle = new BusinessVehicle();
    }

    public void create(Vehicle vehicle) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de crear el cliente
        businessVehicle.create(vehicle);
    }

    public void update(Vehicle vehicle) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de actualizar el cliente
        businessVehicle.update(vehicle);
    }

    public void delete(String idVehicle) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de eliminar el cliente
        businessVehicle.delete(idVehicle);
    }

    public List<Vehicle> getAll() {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de obtener todos los clientes
        return businessVehicle.getAll();
    }

    public Vehicle getById(String idVehicle) {
        // Aquí puedes realizar validaciones u otras operaciones de lógica de negocio antes de obtener un cliente por su ID
        return businessVehicle.getById(idVehicle);
    }
}
