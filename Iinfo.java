package com.company.Crud;

/**
 * Created by clbo on 07/11/2017.
 */
public interface Iinfo<T>{

    public void sendMail(T t);
    public void writeToLog(T t);
}

