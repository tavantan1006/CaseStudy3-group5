package service;

import java.util.List;

public interface
IGeneralService<T> {
    List<T> selectAll();

    T findById(int id);

    boolean save(T t);

    boolean update(int id);

    boolean delete(int id);

}
