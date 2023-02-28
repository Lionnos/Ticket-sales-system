package Users;

public class Vehiculo {

    public static String placa = ""; // ID 
    public static String marca = "";
    public static String disponibilidad = "";
    public static String color = "";

    /*
     * INSERT INTO VEHICULO(vehiculo_placa, vehiculo_marca, vehiculo_disponibilidad, vehiculo_color)
        VALUES ('ABC-321','Toyota','Disponible','Blaco');
     */
    public static void numeroVehiculo(String data){

        switch (data) {
            case "Vehiculo N:1": Tablas.VehiculoID = "ABC-321"; break;
            case "Vehiculo N:2": Tablas.VehiculoID = ""; break;
            case "Vehiculo N:3": Tablas.VehiculoID = ""; break;
        }

    }

    public static void buscarVehiculo(){

    }

}