package com.company.Crud;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clbo on 07/11/2017.
 */
public class StudentRepository implements ICrud<Student> {


    List<Student> students = new ArrayList<Student>();

    @Override
    public List<Student> readAll() {

        // Læs alt fra databasen tabel student

        // SELECT * From Students og tilføj til listenVariable arrayliste

        return super.listenVariable;
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
