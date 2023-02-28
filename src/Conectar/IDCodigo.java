package Conectar;
// no se usa esta clase aun

import java.util.UUID;

public class IDCodigo {


    public static String generarID(){

        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static void main(String[] args) {
        System.out.println(generarID()); 
        //941be759-7b9f-4a08-8d5e-8881fdbf02f3
        //813c5edc-3a55-4135-9626-044d95687c13
        //3ee531c8-9024-44cd-be0a-a2460ac7a61c
        //ccdf16f0-55b3-43f1-a31f-5db71e4c47f5
    }
}
