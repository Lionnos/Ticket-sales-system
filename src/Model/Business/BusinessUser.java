package Model.Business;

import java.util.List;

import Model.Entity.User;
import Model.Query.QUser;
import Model.Query.QGeneric;

public class BusinessUser {
    private QGeneric<User> qUser;

    public BusinessUser () {
        qUser = new QUser();
    }

    
    public void create(User user) {
        //
        qUser.create(user);
    }

    public void update(User user) {
        //
        qUser.update(user);
    }

    public void delete(String idUser) {
        //
        qUser.delete(idUser);
    }

    public List<User> getAll() {
        //
        return qUser.getAll();
    }

    public User getById(String idUser) {
        //
        return qUser.getById(idUser);
    }
}
