package com.example.demoFirst.models;

import lombok.Data;

@Data
public class Student {
    
    private Integer id;
    
    private String nom;

    private String prenom;

    private Integer age;

    private static Integer count = 1;

    public Student(String nom, String prenom, Integer age) {
        ++count;
        this.id = count;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
