package Controller;

import Model.Business.BusinessProgramming;
import Model.Entity.Programming;

import java.util.List;


public class ControllerProgramming {

    private BusinessProgramming businessProgramming;

    public ControllerProgramming() {
        businessProgramming = new BusinessProgramming();
    }
    

    public void create(Programming programming) {
        businessProgramming.create(programming);
    }

    public void update(Programming programming) {
        businessProgramming.update(programming);
    }

    public void delete(String idProgramming) {
        businessProgramming.delete(idProgramming);
    }

    public List<Programming> getAll() {
        return businessProgramming.getAll();
    }

    public Programming getById(String idProgramming) {
        return businessProgramming.getById(idProgramming);
    }
}
