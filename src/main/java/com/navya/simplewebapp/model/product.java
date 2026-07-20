package com.navya.simplewebapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class product {
    @Id
    private int proid;
    private String proname;
    private double proprice;

    public product(int proid,String proname,double proprice){
        this.proid=proid;
        this.proname=proname;
        this.proprice=proprice;
    }

    public product() {

    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public double getProprice() {
        return proprice;
    }

    public void setProprice(double proprice) {
        this.proprice = proprice;
    }

    @Override
    public String toString() {
        return "product{" +
                "proid=" + proid +
                ", proname='" + proname + '\'' +
                ", proprice=" + proprice +
                '}';
    }
}

