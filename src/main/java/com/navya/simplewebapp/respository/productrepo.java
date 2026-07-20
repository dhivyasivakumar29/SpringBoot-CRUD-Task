package com.navya.simplewebapp.respository;

import com.navya.simplewebapp.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productrepo extends JpaRepository<product,Integer> {
}
