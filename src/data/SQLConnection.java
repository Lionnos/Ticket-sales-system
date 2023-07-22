package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    
    public static Connection openConnection(){
        Connection conn = null;
        
        String url = "jdbc:sqlserver://127.0.0.1\\Acer\\SQLEXPRESS:1433;" + //puerto
                    "databaseName=dbBoletos_HenryLeon;" + //nombre del database
                    "encrypt=false;" + // encriptacion SSL(desativado)
                    "trustServerCertificate=false"; //Certificado de servidor de confianza(desactivado)
        
        String user = "Henry";
        String password = "@1001@";

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Exitosa");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        comprobar();
        return conn;
    }
    
    
    static void comprobar() {
        // Cargar el Controlador
        try {
            String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(controlador);
            System.out.println("Controlador Cargado");
        } catch (Exception e) {
            System.out.println("Error al cargar el controlador");
            return; // Salir del método en caso de error
        }
    }
}