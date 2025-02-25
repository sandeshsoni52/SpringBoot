package com.company1.project1.t1147.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CourseData {
    private Map<String, Map<String, Map<String, List<String>>>> categories;

    public static void main(String[] args) {
        CourseData data = new CourseData();
        System.out.println(data.getCategories());  // This should not show an error
    }
}
