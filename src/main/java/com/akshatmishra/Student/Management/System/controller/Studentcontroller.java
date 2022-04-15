package com.akshatmishra.Student.Management.System.controller;

import com.akshatmishra.Student.Management.System.model.Student;
import com.akshatmishra.Student.Management.System.services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class Studentcontroller {
    @Autowired
    private Studentservices studentservices;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentservices.savestudent(student);
        return "New student is added";
    }

   @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentservices.getAllStudents();
    }

}
