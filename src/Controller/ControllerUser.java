package Controller;

import Model.Business.BusinessUser;
import Model.Entity.User;

import java.util.List;

public class ControllerUser {
    private BusinessUser businessUser;

    public ControllerUser() {
        businessUser = new BusinessUser();
    }

    public void create(User user) {
        businessUser.create(user);
    }

    public void update(User user) {
        businessUser.update(user);
    }

    public void delete(String idUser) {
        businessUser.delete(idUser);
    }

    public List<User> getAll() {
        return businessUser.getAll();
    }

    public User getById(String idUser) {
        return businessUser.getById(idUser);
    }
   
}
