package com.example.form.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity
    public class Form {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="userid")
        private Long id;
        @Column(name="userName")
        private String name;
        @Column(name="userPass")
        private String pass;

        public Form() {
        }

        public Form(Long id, String name, String pass) {
            super();
            this.id = id;
            this.name = name;
            this.pass = pass;
        }


        public Long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPass() {
            return pass;
        }
        public void setPass(String pass) {
            this.pass = pass;
        }
    }




