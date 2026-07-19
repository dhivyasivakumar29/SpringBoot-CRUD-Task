package com.Student.StudentApp.Controller;

import com.Student.StudentApp.Service.StudentService;
import com.Student.StudentApp.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {

    @Autowired
    public StudentService service;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student std){
        return service.saveStudent(std);
    }

    @GetMapping("/fetch")
    public List<Student> fetchAll(){
        return service.findAllStd();
    }
    @DeleteMapping("/delete/{stdId}")
    public String deleteStd(@PathVariable Integer stdId){
        service.delete(stdId);
        return  "Student deleted";
    }
}
