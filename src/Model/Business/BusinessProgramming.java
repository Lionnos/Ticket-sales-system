package Model.Business;

import java.util.List;

import Model.Entity.Programming;
import Model.Query.QGeneric;
import Model.Query.QProgramming;

public class BusinessProgramming {
    private QGeneric<Programming> qProgramming;

    public BusinessProgramming () {
        qProgramming = new QProgramming();
    }

    
    public void create(Programming programming) {
        //
        qProgramming.create(programming);
    }

    public void update(Programming programming) {
        //
        qProgramming.update(programming);
    }

    public void delete(String idProgramming) {
        //
        qProgramming.delete(idProgramming);
    }

    public List<Programming> getAll() {
        //
        return qProgramming.getAll();
    }

    public Programming getById(String idProgramming) {
        //
        return qProgramming.getById(idProgramming);
    }
}
