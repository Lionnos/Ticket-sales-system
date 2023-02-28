package Conectar;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/* Esta clase es para buscar una tabla en especifico  y cierta fila de la tabla*/

public class Buscar {
    private static Connection connection = null;
    private static PreparedStatement stmt = null;
    private static ResultSet result = null;
    private static String querry;

    public static ResultSet buscartabla(String nameTable, String nameKey ,int numberKey) throws SQLException {
        
        connection = Conexion.getConnection();
        querry = "SELECT * FROM " + nameTable + " WHERE " + nameKey +"= ?";
        stmt = connection.prepareStatement(querry);
        stmt.setString(1, numberKey+"");
        
        return stmt.executeQuery();
    }

    public static void closeConnection() throws SQLException { 
        connection.close(); // cerramos la conexion
    }


    // Método que busca un usuario por su ID
    public static Boolean buscarUsuarioPorId(String id) {
        Boolean retorna = false;
        try {
            connection = Conexion.getConnection();
            querry = "SELECT * FROM USUARIO WHERE usuario_ID = ?";
            stmt = connection.prepareStatement(querry);
            stmt.setString(1, id);
        
            result =stmt.executeQuery();

            // Mostrar result
            if (result.next()) {
                id = result.getString("usuario_ID");
                System.out.println("Usuario encontrado:");
                retorna = true;
            } else {
                retorna = false;

                System.out.println("Usuario no encontrado:");
            }
            connection.close(); // cerramos la conexion
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        } finally {
            // Cerrar objetos de base de datos (igual que en el método anterior)
        }

        return retorna;
    }

}