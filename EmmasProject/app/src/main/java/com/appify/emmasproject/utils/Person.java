package com.appify.emmasproject.utils;

import com.appify.emmasproject.model.Student;

import java.util.ArrayList;

public class Person {

    private static ArrayList<Student> getStudents() {
        ArrayList students = new ArrayList();

        Student student = new Student();
        students.add(student);

        return students;
    }
}
