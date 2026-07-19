package com.example.form.service;
import java.util.List;

import com.example.form.entity.Form;
import com.example.form.repository.FormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public Form updateUser(Long id,Form ex) {
        Form exist=repo.findById(id).orElse(null);
        if(exist!=null) {
            if((ex.getName())!=null) {
                exist.setName(ex.getName());
            }
            if((ex.getPass())!=null) {
                exist.setPass(ex.getPass());
            }
        }
        return repo.save(exist);
    }

        public ResponseEntity<String> deleteUser(Long id) {
            Form exist=repo.findById(id).orElse(null);
            if (exist==null) {
                return ResponseEntity.status(404).body("User not found");
            }

            repo.delete(exist);
            return ResponseEntity.ok("User Deleted Successful");

    }


}