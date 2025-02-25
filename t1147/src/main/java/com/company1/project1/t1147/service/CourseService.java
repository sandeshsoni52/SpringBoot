package com.company1.project1.t1147.service;

import com.company1.project1.t1147.model.CourseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;

@Service
public class CourseService {
    private final CourseData courseData;

    public CourseService() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.courseData = objectMapper.readValue(
                Paths.get("src/main/resources/allcourses.json").toFile(),
                CourseData.class
        );
    }

    public CourseData getCourses() {
        return courseData;
    }
}
