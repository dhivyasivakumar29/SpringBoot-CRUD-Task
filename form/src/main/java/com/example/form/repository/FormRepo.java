package com.example.form.repository;

import com.example.form.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepo extends JpaRepository<Form,Long> {
}
