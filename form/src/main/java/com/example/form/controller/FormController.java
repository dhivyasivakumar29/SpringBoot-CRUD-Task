package com.example.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.entity.Form;
import com.example.form.service.FormService;


@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormService service;

    @PostMapping("/createUser")
    public String addUser(@RequestBody Form obj) {
        service.createUser(obj);
        return "User Created Successful";


    }

    @GetMapping("/getUser")
    public List<Form> getUsers() {
        return service.getUser();
    }

    @PutMapping("/update/{id}")
    public Form updateUser(@PathVariable long id,@RequestBody Form ex){
        return service.updateUser(id,ex);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable long id) {
        return service.deleteUser(id);

    }

}
