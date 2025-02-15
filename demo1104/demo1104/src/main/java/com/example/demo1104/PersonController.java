package com.example.demo1104;

import com.example.demo1104.model.Person;
import com.example.demo1104.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonRepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        logger.info("Received Person: {}", person);
        repo.save(person);
    }
}
