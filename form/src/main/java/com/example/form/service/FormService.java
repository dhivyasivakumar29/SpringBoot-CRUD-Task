package com.example.form.service;
import java.util.List;

import com.example.form.entity.Form;
import com.example.form.repository.FormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FormService {
    @Autowired
    private FormRepo repo;

    public Form createUser(Form form) {
        return repo.save(form);
    }

    public List<Form> getUser() {
        return repo.findAll();
    }


}