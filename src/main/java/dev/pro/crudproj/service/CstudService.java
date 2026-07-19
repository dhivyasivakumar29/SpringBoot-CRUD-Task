package dev.pro.crudproj.service;

import dev.pro.crudproj.model.Cstud;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CstudService {

    List<Cstud> cstudent= new ArrayList<>();

    public List<Cstud> getCstudent() {
        return  Arrays.asList(
                new Cstud(1,"LALA","AI"),
        new Cstud(2,"DALA","DS"),
        new Cstud(3,"JALA","AI/ML")

        );
    }

}
