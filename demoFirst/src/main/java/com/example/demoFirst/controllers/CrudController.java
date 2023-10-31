package com.example.demoFirst.controllers;

import com.example.demoFirst.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class CrudController {

    ArrayList<Student> student = new ArrayList<Student>();

    //@GetMapping // GET http://localhost:8080/api/v1/student
    // public List<String> getAllStudent(){

    //     return List.of("John Harper","Patrick Delaclasse","Arthur centema Sonio Erté Vega de La suba");
    // }
    @GetMapping // GET http://localhost:8080/api/v1/student
    public List<Student> getAllStudent(){
        return student;
    }

    
    @GetMapping("/{id}")  // GET http://localhost:8080/api/v1/student/x
    public String gatOneStudent(@PathVariable int id, Student student){

        return "Vous chercher l'élève avec l'id : "+ id +"\n:"+ student ;
    }

    @PostMapping // POST http://localhost:8080/api/v1/student
    public Student create(@RequestBody Student student){
        return student;
    }

    @DeleteMapping("/{id}")  // Delete http://localhost:8080/api/v1/student/x
    public String deleteStudent(@PathVariable int id){
        return "Vous chercher a supprimer la personne avec l'id : "+ id;
    }

    @PutMapping("/{id}")  // Put http://localhost:8080/api/v1/student/x
    public String updateStudent(@PathVariable int id){
        return "Vous chercher a modifier la personne avec l'id : "+ id;
    }
}
