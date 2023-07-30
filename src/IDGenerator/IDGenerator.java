package IDGenerator;

import java.util.UUID;

public class IDGenerator {

    // Genera id de un tamanño 12
    public static String generateCustomID() {
        UUID uuid = UUID.randomUUID();
        String uuidPrefix = uuid.toString().substring(0, 13).replaceAll("-", "");
        return uuidPrefix;
    }

    public static void main(String[] args) {
        String s = generateCustomID();
        System.out.println(s);
    }
}
