package Pagos;

import java.math.BigDecimal;

public class TipoPago {
    
    public static BigDecimal efectivo = new BigDecimal("0.00");
    public static BigDecimal tarjeta = new BigDecimal("0.00");
    public static BigDecimal movil = new BigDecimal("0.00");

    public static void pagoEfectico(String pago){
        // Este campo tambien requerira de las promociones
        switch (pago) {
            case "Efectivo": efectivo = new BigDecimal("15.00"); break;
            case "Tarjeta": efectivo = new BigDecimal("15.00"); break;
            case "Movil": efectivo = new BigDecimal("15.00"); break;
        }
    }

    public static void pagoTarjeta(String pago){
        
    }

    public static void pagoMovil(String pago){
        
    }
}
