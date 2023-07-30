package Controller;

import Model.Entity.User;
import Model.Query.QUser;
import Model.Query.QGeneric;


import java.util.List;

public class UserController {
    private QGeneric<User> qUuser;

    public UserController() {
        qUuser = new QUser();
    }

    public void create(User user) {
        qUuser.create(user);
    }

    public void update(User user) {
        qUuser.update(user);
    }

    public void delete(String idUser) {
        qUuser.delete(idUser);
    }

    public List<User> getAll() {
        return qUuser.getAll();
    }

    public User getById(String idUser) {
        return qUuser.getById(idUser);
    }
   
}
