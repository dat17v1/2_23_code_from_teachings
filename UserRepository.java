package com.company.Crud;

import java.util.List;

/**
 * Created by clbo on 07/11/2017.
 */
public class UserRepository implements ICrud<User>, Iinfo<User> {
    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public User read(int id) {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void sendMail(User user){

    }

    @Override
    public void writeToLog(User user) {

    }
}
