package Model.Query;

import java.util.List;

public interface QGeneric<T> {
    void create(T entity);
    void update(T entity);
    void delete(String id);
    List<T> getAll();
    T getById(String id);
}
