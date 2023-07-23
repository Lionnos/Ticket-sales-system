package View.Main;

import java.util.UUID;

public class IDGenerator {

    public static void main(String[] args) {
        String customID = generateCustomID();
        System.out.println("Custom ID: " + customID);
        String customID12 = generateCustomID12();
        System.out.println("Custom ID: " + customID12);
    }

    public static String generateCustomID() {
        // Generamos un UUID
        UUID uuid = UUID.randomUUID();

        // Obtenemos los primeros 6 caracteres del UUID (sin los guiones)
        String uuidPrefix = uuid.toString().substring(0, 6).replaceAll("-", "");

        return uuidPrefix;
    }

    public static String generateCustomID12() {
        // Generamos un UUID
        UUID uuid = UUID.randomUUID();

        // Obtenemos los primeros 10 caracteres del UUID (sin los guiones)
        String uuidPrefix = uuid.toString().substring(0, 13).replaceAll("-", "");

        return uuidPrefix;
    }

}
