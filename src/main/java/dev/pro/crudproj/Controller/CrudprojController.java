package dev.pro.crudproj.Controller;

import dev.pro.crudproj.model.Cstud;
import dev.pro.crudproj.service.CstudService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController                             // representational state transfer  it contl ed point to what to do
public class CrudprojController {
    @Autowired
    CstudService CstudService;

    @GetMapping("/Cstudent")
    public List<Cstud> getCstud() {
        return CstudService.getCstudent();
    }

}

