package Controller;

import Model.Entity.Programming;
import Model.Query.QGeneric;
import Model.Query.QProgramming;

import java.util.List;

import IDGenerator.IDGenerator;

/*
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
*/


public class ProgrammingController {

    private QGeneric<Programming> qProgramming;

    public ProgrammingController() {
        qProgramming = new QProgramming();
    }
    

    public void create(Programming programming) {

        String id = IDGenerator.generateCustomID();

        if (programming.getIdProgramming() == null || programming.getIdProgramming().isEmpty()) {
            programming.setIdProgramming(id);
        }
        qProgramming.create(programming);
    }

    public void update(Programming programming) {
        qProgramming.update(programming);
    }

    public void delete(String idProgramming) {
        qProgramming.delete(idProgramming);
    }

    public List<Programming> getAll() {
        return qProgramming.getAll();
    }

    public Programming getById(String idProgramming) {
        return qProgramming.getById(idProgramming);
    }
    /*
    public static void main(String[] args) {
        // Crear una instancia del controlador
        ProgrammingController programmingController = new ProgrammingController();

        // Crear un objeto Programming con los datos de la nueva programación
        String idVehicle = "2375f3e553c8";
        String origin = "Ciudad A";
        String destination = "Ciudad B";
        Date programmingDate = Date.valueOf("2023-08-01"); // Ejemplo: 1 de agosto de 2023
        Time programmingHour = Time.valueOf("10:30:00"); // Ejemplo: 10:30 AM
        BigDecimal totalCost = new BigDecimal("150.75");
        boolean state = true;

        Programming newProgramming = new Programming(null, idVehicle, origin, destination, programmingDate,
                programmingHour, totalCost, state);

        // Llamar al método create para insertar la nueva programación
        programmingController.create(newProgramming);
    }
*/
}
