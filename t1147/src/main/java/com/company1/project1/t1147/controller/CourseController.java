package com.company1.project1.t1147.controller;

import com.company1.project1.t1147.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<String> getLevels() {
        return courseService.getDegrees().getLevels().keySet().stream().toList();
    }

    /**
     * Get faculties based on selected level.
     */
    @GetMapping("/faculties/{level}")
    public List<String> getFaculties(@PathVariable String level) {
        return courseService.getDegrees().getLevels().get(level).keySet().stream().toList();
    }

    // /**
    // * Get institutes based on level and faculty.
    // */
    // @GetMapping("/institutes/{level}/{faculty}")
    // public List<String> getDegrees(@PathVariable String level, @PathVariable
    // String faculty) {
    // return
    // courseService.getDegrees().getLevels().get(level).get(faculty).keySet().stream().toList();
    // }
    @GetMapping("/institutes/{level}/{faculty}")
    public List<String> getInstitutes(@PathVariable String level, @PathVariable String faculty) {
        return courseService.getInstitutes(level, faculty);
    }

    // /**
    //  * Get degrees_mixture based on level and faculty.
    //  */
    // @GetMapping("/courses/{level}/{faculty}")
    // public List<String> getDegrees(@PathVariable String level, @PathVariable String faculty) {
    //     return courseService.getDegrees().getLevels().get(level).get(faculty).values().stream()
    //             .flatMap(List::stream)
    //             .collect(Collectors.toList());
    // }

    /**
    * Get degrees based on level, faculty and institute.
    */
    @GetMapping("/courses/{level}/{faculty}/{institute}")
    public List<String> getDegrees(@PathVariable String level, @PathVariable
    String faculty,
    @PathVariable String institute) {
    return
            new ArrayList<>(courseService.getDegrees().getLevels().get(level).get(faculty).get(institute));
    }
}
