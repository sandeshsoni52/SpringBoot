package com.example.demo1523;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("abcd")
    public String sayHello(){
        return "Hello1641";
    }
}
