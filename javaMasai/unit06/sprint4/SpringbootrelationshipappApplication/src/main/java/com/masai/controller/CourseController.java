package com.masai.controller;

import com.masai.model.Course;
import com.masai.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/courses")
    public ResponseEntity<Course> saveCourseHandler(@RequestBody Course course){

        Course savedCourse = courseService.registerNewCourse(course);

        return new ResponseEntity<Course>(savedCourse, HttpStatus.CREATED);

    }

}
