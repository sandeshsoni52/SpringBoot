package com.example.demo1104.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class  Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "middle")
    @JsonProperty("middle")
    private String middle;

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}
