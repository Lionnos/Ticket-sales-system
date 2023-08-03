package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    private static Connection conn = null;

    public static Connection openConnection() {
        if (conn == null) {
            String url = "jdbc:sqlserver://127.0.0.1\\Acer\\SQLEXPRESS:1433;" +
                    "databaseName=dbVentaBoletos;" +
                    "encrypt=false;" +
                    "trustServerCertificate=false";
            String user = "Henry";
            String password = "@1001@";
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexion Exitosa");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            comprobar();
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexion cerrada correctamente");
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion: " + ex.getMessage());
            } finally {
                conn = null;
            }
        }
    }

    static void comprobar() {
        try {
            String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(controlador);
            System.out.println("Controlador Cargado");
        } catch (Exception e) {
            System.out.println("Error al cargar el controlador");
            return;
        }
    }
}
