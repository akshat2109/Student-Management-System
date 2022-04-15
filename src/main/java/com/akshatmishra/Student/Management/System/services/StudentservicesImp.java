package com.akshatmishra.Student.Management.System.services;

import com.akshatmishra.Student.Management.System.model.Student;
import com.akshatmishra.Student.Management.System.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentservicesImp implements Studentservices{

    @Autowired
    private Studentrepository studentrepository;

    @Override
    public Student savestudent(Student student) {
        return studentrepository.save(student);
    }

   @Override
    public List<Student> getAllStudents() {
        return studentrepository.findAll() ;
    }
}
