package com.company.Crud;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clbo on 07/11/2017.
 */
public class InMemoryStudentsRepository implements ICrud<Student> {


    List<Student> students = new LinkedList<Student>();

    @Override
    public List<Student> readAll() {

        // tilføj 99 students til arrayliste

        return students;
    }

    @Override
    public Student read(int id) {
        return null;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }
}
