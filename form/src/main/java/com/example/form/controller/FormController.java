package com.example.form.controller;

import java.util.List;

import com.example.form.entity.Form;
import com.example.form.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/form")
@CrossOrigin(origins="http://localhost:5173")
public class FormController {

    @Autowired
    private FormService service;

    @PostMapping("/createUser")
    public String addUser(@RequestBody Form obj) {
        service.createUser(obj);
        return "User Created Successfully";


    }

    @GetMapping("/getUser")
    public List<Form> getUsers() {
        return service.getUser();
    }


}
