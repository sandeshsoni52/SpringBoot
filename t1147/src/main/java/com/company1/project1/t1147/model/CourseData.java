package com.company1.project1.t1147.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseData {
    //we are writing our own getter
    private Map<String, Map<String, Map<String, List<String>>>> levels;

    // Manually added getter for `levels`
    public Map<String, Map<String, Map<String, List<String>>>> getLevels() {
        return levels;
    }

}
