package com.company1.project1.t1147.service;

import com.company1.project1.t1147.model.CourseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final CourseData degreeData;

    public CourseService() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.degreeData = objectMapper.readValue(
                Paths.get("src/main/resources/allcourses.json").toFile(),
                CourseData.class);
    }

    public CourseData getDegrees() {
        return degreeData;
    }

    public List<String> getInstitutes(String level, String faculty) {
        return new ArrayList<>(degreeData.getLevels().get(level).get(faculty).keySet());
    }
}
