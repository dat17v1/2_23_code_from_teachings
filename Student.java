package com.company.Crud;

/**
 * Created by clbo on 07/11/2017.
 */
public class Student {

    private String name;
    private String cpr;

    public Student() {
    }

    public Student(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
}
