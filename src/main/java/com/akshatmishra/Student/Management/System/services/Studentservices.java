package com.akshatmishra.Student.Management.System.services;

import com.akshatmishra.Student.Management.System.model.Student;

import java.util.List;

public interface Studentservices {
    public Student savestudent(Student student);
    public List<Student> getAllStudents();
}
