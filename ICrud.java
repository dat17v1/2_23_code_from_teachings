package com.company.Crud;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clbo on 07/11/2017.
 */
public interface ICrud<T> {

    //CRUD
    public List<T> readAll();
    public T read(int id);
    public void create(T t);
    public void delete(int id);
    public void update(T t);

}
