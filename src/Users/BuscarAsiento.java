package Users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import Conectar.Conexion;

public class BuscarAsiento {
    private static int fila = 18;

    public static Object[][] tablabolet(){

        try (Connection connection = Conexion.getConnection()) {
        
            // Obtener todos los datos de la tabla
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM BOLETA";
            ResultSet resultSet = statement.executeQuery(query);

            // Obtener el número de columnas
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            // Crear una matriz para almacenar los datos de la tabla
            Object[][] matrix = new Object[fila][columnCount];

            // Leer los datos del resultado y almacenarlos en la matriz
            int rowIndex = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    matrix[rowIndex][i - 1] = resultSet.getObject(i);
                }
                rowIndex++;
            }
            connection.close();
            statement.close();
            resultSet.close();
            return matrix;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object[][] tablavent(){

        try (Connection connection = Conexion.getConnection()) {
        
            // Obtener todos los datos de la tabla
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM VENTA";
            ResultSet resultSet = statement.executeQuery(query);

            // Obtener el número de columnas
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            // Crear una matriz para almacenar los datos de la tabla
            Object[][] matrix = new Object[fila][columnCount];

            // Leer los datos del resultado y almacenarlos en la matriz
            int rowIndex = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    matrix[rowIndex][i - 1] = resultSet.getObject(i);
                }
                rowIndex++;
            }
            connection.close();
            statement.close();
            resultSet.close();
            return matrix;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object[][] tablaclient(){

        try (Connection connection = Conexion.getConnection()) {
        
            // Obtener todos los datos de la tabla
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM CLIENTE";
            ResultSet resultSet = statement.executeQuery(query);

            // Obtener el número de columnas
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            // Crear una matriz para almacenar los datos de la tabla
            Object[][] matrix = new Object[fila][columnCount];

            // Leer los datos del resultado y almacenarlos en la matriz
            int rowIndex = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    matrix[rowIndex][i - 1] = resultSet.getObject(i);
                }
                rowIndex++;
            }
            connection.close();
            statement.close();
            resultSet.close();
            return matrix;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Object[][] tablareserv(){

        try (Connection connection = Conexion.getConnection()) {
        
            // Obtener todos los datos de la tabla
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM RESERVA";
            ResultSet resultSet = statement.executeQuery(query);

            // Obtener el número de columnas
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            // Crear una matriz para almacenar los datos de la tabla
            Object[][] matrix = new Object[fila][columnCount];

            // Leer los datos del resultado y almacenarlos en la matriz
            int rowIndex = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    matrix[rowIndex][i - 1] = resultSet.getObject(i);
                }
                rowIndex++;
            }
            connection.close();
            statement.close();
            resultSet.close();
            return matrix;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object[][] tablaviaj(){

        try (Connection connection = Conexion.getConnection()) {
        
            // Obtener todos los datos de la tabla
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM VIAJE";
            ResultSet resultSet = statement.executeQuery(query);

            // Obtener el número de columnas
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            // Crear una matriz para almacenar los datos de la tabla
            Object[][] matrix = new Object[fila][columnCount];

            // Leer los datos del resultado y almacenarlos en la matriz
            int rowIndex = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    matrix[rowIndex][i - 1] = resultSet.getObject(i);
                }
                rowIndex++;
            }
            connection.close();
            statement.close();
            resultSet.close();
            return matrix;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }































    public int[] asientoVendido(){
        int[] asientos = new int[18];
        int index = 0;
        try (Connection conn = Conexion.getConnection()) {
            // Crear una sentencia SQL
            String sql = "SELECT * FROM BOLETA";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
      
            // Recorrer el conjunto de resultados y procesar cada registro
            while (resultSet.next()) {
                asientos[index] = resultSet.getInt("boleta_asiento");
                index++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return asientos;
    }

    public String[] idVendidos(){
        String[] id= new String[18];
        int index = 0;
        try (Connection conn = Conexion.getConnection()) {
            // Crear una sentencia SQL
            String sql = "SELECT * FROM BOLETA";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // Recorrer el conjunto de resultados y procesar cada registro
            while (resultSet.next()) {
                id[index] = resultSet.getString("boleta_ID");
                index++;
            }
      
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

    public String[] idVenta(){
        String[] id= new String[18];
        int index = 0;
        try (Connection conn = Conexion.getConnection()) {
            // Crear una sentencia SQL
            String sql = "SELECT * FROM VENTA";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            // Recorrer el conjunto de resultados y procesar cada registro
            while (resultSet.next()) {
                id[index] = resultSet.getString("venta_ID");
                index++;
            }
      
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

    public int[] asientoReservado(){

        int[] asientos = new int[18];
        int index = 0;

        //BigDecimal pago = new BigDecimal("0.00");
        
        try (Connection conn = Conexion.getConnection()) {
            // Crear una sentencia SQL
            String sql = "SELECT * FROM RESERVA";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
      
            // Recorrer el conjunto de resultados y procesar cada registro
            while (resultSet.next()) {
                //String id = resultSet.getString("boleta_ID");
                //pago  = resultSet.getBigDecimal("boleta_precio");
                asientos[index] = resultSet.getInt("reserva_asiento");
                //String ventasId = resultSet.getString("venta_ID");
                //String viajesId = resultSet.getString("viaje_ID");
                index++;
            }
      
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return asientos;

    }



}
