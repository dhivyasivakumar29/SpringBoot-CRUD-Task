package com.navya.simplewebapp.controller;


import com.navya.simplewebapp.model.product;
import com.navya.simplewebapp.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class productcontroller {
     @Autowired
     productservice service;

     @RequestMapping("/product")
     public List<product> getproducts() {

          return service.getProducts();
     }

//     @GetMapping("/product/{proid}")
//     public product getproductbyid(@PathVariable int proid) {
//          return service.getproductbyid(proid);
//     }
//}
//     @RequestMapping("/product/{proname}")
//     public product getproductbyname(@PathVariable String proname){
//          return service.getproductbyname(proname);
//     }
//     @PostMapping("/product")
//public void addproduct(@RequestBody product prod){
//          System.out.println(prod);
//           service.addproduct(prod);
//}
//@PutMapping("/product")
//public void updateproduct(@RequestBody product prod){
//          service.updateproduct(prod);
//}
@DeleteMapping("/product/{proname}")
public void deleteproduct(@PathVariable int proid){
          service.deleteproduct(proid);
}
//
//}
