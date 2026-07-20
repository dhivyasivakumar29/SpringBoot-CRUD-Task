package com.navya.simplewebapp.service;


import com.navya.simplewebapp.model.product;
import com.navya.simplewebapp.respository.productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class productservice {
    @Autowired
    productrepo repo;

//    public List<product> products= new ArrayList<>(Arrays.asList(new product(101,"faceserum",500),
//            new product(102,"mosituring",200),
//            new product(103,"facecream",900)));
    public List<product> getProducts(){
        return repo.findAll();
    }
    public product getproductbyid(int proid){
        return repo.findById(proid).orElse(new product());
    }
//    public product getproductbyname(String proname){
//        return products.stream().filter(p->p.getProname().equals(proname)).findFirst().get();
//    }
    public void addproduct(product prod){

        repo.save(prod);
    }
    public void updateproduct(product prod){
        repo.save(prod);

    }
    public void deleteproduct(int proid) {
      repo.deleteById(proid);
    }
}
