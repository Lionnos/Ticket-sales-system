package Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Conectar.Conexion;

public class Actualizar {
    private static Connection connection = null;

    //maximo id de la tabla VENTA
    public static void ulitmasID() {
        String str;
        
        // TABLA CLIENTE
        try {
            connection = Conexion.getConnection();
            String q = "SELECT MAX(CAST(SUBSTRING(cliente_ID, 8, LEN(cliente_ID)) AS INT)) AS last_id FROM CLIENTE WHERE cliente_ID LIKE 'CLIENT-%'";
            PreparedStatement stmt = connection.prepareStatement(q);
            ResultSet result = stmt.executeQuery();
            int number = 1;
            if (result.next()) {
                number += result.getInt("last_id");// 8
                str = Separar.cadena(Tablas.ClienteID, 0); //> CLIENT-
                Tablas.ClienteID = str + "00" + (number+"");
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // TABLA TIPPO_PAGO
        try {
            connection = Conexion.getConnection();
            String q = "SELECT MAX(CAST(SUBSTRING(pago_ID, 5, LEN(pago_ID)) AS INT)) AS last_id FROM TIPO_PAGO WHERE pago_ID LIKE 'PAY-%'";
            PreparedStatement stmt = connection.prepareStatement(q);
            ResultSet result = stmt.executeQuery();
            int number = 1;
            if (result.next()) {
                number += result.getInt("last_id");// 8
                str = Separar.cadena(Tablas.PagoID, 0); //> CLIENT-
                Tablas.PagoID = str + "00" + (number+"");
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // TABLA VIAJE
        try {
            connection = Conexion.getConnection();
            String q = "SELECT MAX(CAST(SUBSTRING(viaje_ID, 6, LEN(viaje_ID)) AS INT)) AS last_id FROM VIAJE WHERE viaje_ID LIKE 'TRIP-%'";
            PreparedStatement stmt = connection.prepareStatement(q);
            ResultSet result = stmt.executeQuery();
            int number = 1;
            if (result.next()) {
                number += result.getInt("last_id");// 8
                str = Separar.cadena(Tablas.ViajeID, 0); //> CLIENT-
                Tablas.ViajeID = str + "00" + (number+"");
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // TABLA VENTA
        try {
            connection = Conexion.getConnection();
            String q = "SELECT MAX(CAST(SUBSTRING(venta_ID, 6, LEN(venta_ID)) AS INT)) AS last_id FROM VENTA WHERE venta_ID LIKE 'SALE-%'";
            PreparedStatement stmt = connection.prepareStatement(q);
            ResultSet result = stmt.executeQuery();
            int number = 1;
            if (result.next()) {
                number += result.getInt("last_id");// 8
                str = Separar.cadena(Tablas.VentaID, 0); //> CLIENT-
                Tablas.VentaID = str + "00" + (number+"");
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // TABLA BOLETA
        try {
            connection = Conexion.getConnection();
            String q = "SELECT MAX(CAST(SUBSTRING(boleta_ID, 8, LEN(boleta_ID)) AS INT)) AS last_id FROM BOLETA WHERE boleta_ID LIKE 'TICKET-%'";
            PreparedStatement stmt = connection.prepareStatement(q);
            ResultSet result = stmt.executeQuery();
            int number = 1;
            if (result.next()) {
                number += result.getInt("last_id");// 8
                str = Separar.cadena(Tablas.BoletaID, 0); //> CLIENT-
                Tablas.BoletaID = str + "00" + (number+"");
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        // TABLA RESERVA
        try {
            connection = Conexion.getConnection();
            String q = "SELECT MAX(CAST(SUBSTRING(reserva_ID, 7, LEN(reserva_ID)) AS INT)) AS last_id FROM RESERVA WHERE reserva_ID LIKE 'RESER-%'";
            PreparedStatement stmt = connection.prepareStatement(q);
            ResultSet result = stmt.executeQuery();
            int number = 1;
            if (result.next()) {
                number += result.getInt("last_id");// 8
                str = Separar.cadena(Tablas.ReservaID, 0); //> CLIENT-
                Tablas.ReservaID = str + "00" + (number+"");
            }
            result.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
