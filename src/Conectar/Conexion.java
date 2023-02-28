package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Henry
 */
public class Conexion {
 
    public static Connection getConnection(){
        Connection conn = null;

        String url = "jdbc:sqlserver://localhost:1433;" + //puerto
                    "databaseName=SISTEMA_PASAJES;" + //nombre del database
                    "loginTimeout=30;" + //tiempo de conexion 30seg
                    "encrypt=false;" + // encriptacion SSL(desativado)
                    "trustServerCertificate=false"; //Certificado de servidor de confianza(desactivado)
        String user = "sa";
        String password = "1001";
    
        try {

            conn = DriverManager.getConnection(url, user, password);
           // System.out.println("conection true");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
