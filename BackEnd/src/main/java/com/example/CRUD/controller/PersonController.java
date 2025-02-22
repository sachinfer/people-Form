package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000") // Enable CORS for React
@RestController
@RequestMapping("/api/people")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }
}
