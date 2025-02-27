package com.company1.project1.t1147.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseData {  //we are writing our own getter
    private Map<String, Map<String, Map<String, List<String>>>> levels;

    // Manually added getter for `categories`
    public Map<String, Map<String, Map<String, List<String>>>> getLevels() {
        return levels;
    }

    // (Optional) Manually add a setter if needed
    public void setCategories(Map<String, Map<String, Map<String, List<String>>>> levels) {
        this.levels = levels;
    }

    // Test the getter
    public static void main(String[] args) {
        CourseData data = new CourseData();
        System.out.println(data.getLevels());  // This should no longer show an error
    }
}
