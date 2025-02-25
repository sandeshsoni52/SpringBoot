package com.company1.project1.t1147.controller;

import com.company1.project1.t1147.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * Get all available categories.
     */
    @GetMapping("/levels")
    public List<String> getCategories() {
        return courseService.getCourses().getCategories().keySet().stream().toList();
    }

    /**
     * Get institutes based on selected category.
     */
    @GetMapping("/faculties/{category}")
    public List<String> getFaculties(@PathVariable String category) {
        return courseService.getCourses().getCategories().get(category).keySet().stream().toList();
    }

    /**
     * Get courses based on category and institute.
     */
    @GetMapping("/courses/{category}/{faculty}")
    public List<String> getCourses(@PathVariable String category, @PathVariable String faculty) {
        return courseService.getCourses().getCategories().get(category).get(faculty).values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
