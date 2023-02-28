package Conectar;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Users.Usuario;

public class EnterUser {
    private static Connection connection = null;
    private static PreparedStatement stmt = null;
    private static String query;
    
    // AGREGADNO DATOS A LA TABLA solo si el usuario esta registrandose por primera vez
    public void insertar(){

        if (Buscar.buscarUsuarioPorId(Usuario.usuarioID) == false && Usuario.ACTIVO == true){
            
            try {
                connection = Conexion.getConnection();
                // Las (?,?,...,?) son para evitar SQL Inyeccion
                query = "INSERT INTO USUARIO (usuario_ID, usuario_nombre, usuario_apellido, usuario_cargo, usuario_telefono) VALUES(?,?,?,?,?)";
                stmt = connection.prepareStatement(query);
    
                stmt.setString(1,Usuario.usuarioID);
                stmt.setString(2,Usuario.usuario_nombre);
                stmt.setString(3,Usuario.usuario_apellido);
                stmt.setString(4,Usuario.usuario_cargo);
                stmt.setInt(5,Usuario.usuario_telefono);
    
                int resultado = stmt.executeUpdate();
    
                if (resultado > 0) {
                    System.out.println("guardado");
                } else {
                    System.out.println("no se guardo");
                }
                connection.close(); // cerramos la conexion
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}
