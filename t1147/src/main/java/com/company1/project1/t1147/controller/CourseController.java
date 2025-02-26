package com.company1.project1.t1147.controller;

import com.company1.project1.t1147.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * Get all available levels.
     */
    @GetMapping("/levels")
    public List<String> getCategories() {
        return courseService.getCourses().getCategories().keySet().stream().toList();
    }

    /**
     * Get faculties based on selected level.
     */
    @GetMapping("/faculties/{category}")
    public List<String> getFaculties(@PathVariable String category) {
        return courseService.getCourses().getCategories().get(category).keySet().stream().toList();
    }

    // /**
    // * Get institutes based on level and faculty.
    // */
    // @GetMapping("/institutes/{category}/{faculty}")
    // public List<String> getCourses(@PathVariable String category, @PathVariable
    // String faculty) {
    // return
    // courseService.getCourses().getCategories().get(category).get(faculty).keySet().stream().toList();
    // }
    @GetMapping("/institutes/{category}/{faculty}")
    public List<String> getInstitutes(@PathVariable String category, @PathVariable String faculty) {
        return courseService.getInstitutes(category, faculty);
    }

    // /**
    //  * Get degrees_mixture based on level and faculty.
    //  */
    // @GetMapping("/courses/{category}/{faculty}")
    // public List<String> getCourses(@PathVariable String category, @PathVariable String faculty) {
    //     return courseService.getCourses().getCategories().get(category).get(faculty).values().stream()
    //             .flatMap(List::stream)
    //             .collect(Collectors.toList());
    // }

    /**
    * Get degrees based on level, faculty and institute.
    */
    @GetMapping("/courses/{category}/{faculty}/{institute}")
    public List<String> getCourses(@PathVariable String category, @PathVariable
    String faculty,
    @PathVariable String institute) {
    return
    courseService.getCourses().getCategories().get(category).get(faculty).get(institute).stream()
    .collect(Collectors.toList());
    }
}
