package com.Student.StudentApp.Service;

import com.Student.StudentApp.Repository.StudentRepository;
import com.Student.StudentApp.Student;
import com.Student.StudentApp.StudentAppApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository repository;

    public Student saveStudent(Student std){
        return repository.save(std);
    }
    public List<Student> findAllStd(){
        return repository.findAll();
    }
    public String delete(Integer stdId){
        repository.deleteById(stdId);
        return "Data deleted";
    }
    public Student updatestd(int stdId,Student std){
        return repository.save(std);
    }
}

