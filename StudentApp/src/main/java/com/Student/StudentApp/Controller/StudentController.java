package com.Student.StudentApp.Controller;

import com.Student.StudentApp.Service.StudentService;
import com.Student.StudentApp.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

    @Autowired
    public StudentService service;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student std){
        return service.saveStudent(std);
    }
}
