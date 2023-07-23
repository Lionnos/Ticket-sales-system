package Model.Query;

import Database.SQLConnection;
import Model.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QUser implements QGeneric<User>{

    private Connection connection;

    public QUser() {
        connection = SQLConnection.openConnection();
    }

    @Override
    public void create(User user) {
        try {
            String query = "INSERT INTO Tuser (idUser, first_name, last_name, gender, email, username, password, created_at) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getIdUser());
            statement.setString(2, user.getFirstName());
            statement.setString(3, user.getLastName());
            statement.setBoolean(4, user.isGender());
            statement.setString(5, user.getEmail());
            statement.setString(6, user.getUsername());
            statement.setString(7, user.getPassword());
            statement.setTimestamp(8, new java.sql.Timestamp(user.getCreatedAt().getTime()));

            statement.executeUpdate();
            statement.close();

            System.out.println("Usuario creado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        try {
            String query = "UPDATE Tuser SET first_name = ?, last_name = ?, gender = ?, " +
                    "email = ?, username = ?, password = ?, created_at = ? WHERE idUser = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setBoolean(3, user.isGender());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getUsername());
            statement.setString(6, user.getPassword());
            statement.setTimestamp(7, new java.sql.Timestamp(user.getCreatedAt().getTime()));
            statement.setString(8, user.getIdUser());

            statement.executeUpdate();
            statement.close();

            System.out.println("Usuario actualizado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String idUser) {
        try {
            String query = "DELETE FROM Tuser WHERE idUser = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idUser);

            statement.executeUpdate();
            statement.close();

            System.out.println("Usuario eliminado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();

        try {
            String query = "SELECT * FROM Tuser";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                User user = extractFromResultSet(resultSet);
                users.add(user);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return users;
    }

    @Override
    public User getById(String idUser) {
        User user = null;

        try {
            String query = "SELECT * FROM Tuser WHERE idUser = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idUser);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = extractFromResultSet(resultSet);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return user;
    }

    private User extractFromResultSet(ResultSet resultSet) throws SQLException {
        String idUser = resultSet.getString("idUser");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        boolean gender = resultSet.getBoolean("gender");
        String email = resultSet.getString("email");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        java.sql.Timestamp createdAt = resultSet.getTimestamp("created_at");

        return new User(idUser, firstName, lastName, gender, email, username, password, createdAt);
    }
}
