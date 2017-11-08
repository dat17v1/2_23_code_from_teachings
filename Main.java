package com.company.Crud;

/**
 * Created by clbo on 07/11/2017.
 */
public class Main {


    public static void main(String[] args )
    {
        ICrud<Student> studentslist = new StudentRepository();
        ICrud<User> usersslist = new UserRepository();
        ICrud<Course> coursesslist = new CourseRepository();




        studentslist.readAll();
        studentslist.read(1):
        studentslist.create(new Student("Claus", "243242342"));
        studentslist.delete(1);
        studentslist.update(new Student());






    }

}
