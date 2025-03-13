package com.example.demo1104;

import com.example.demo1104.model.Person;
import com.example.demo1104.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@RequestMapping("/persons")
@CrossOrigin(origins = "*")
@RestController
public class PersonController {

    @Autowired
    PersonRepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        System.out.println("Received Person: " + person);
        repo.save(person);
    }

//    @GetMapping("/{id}")
//    public Optional<Person> getPerson(@PathVariable Long id){
//        return repo.findById(id);
//    }
}
