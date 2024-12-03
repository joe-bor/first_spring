package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.services.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourse(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("{id}")
    public Course getCourseById(@PathVariable long id){
        return this.courseService.getCourseById(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable long id){
         this.courseService.updateCourse(course, id);
    }

    @DeleteMapping("{id}")
    public void deleteCourse(@PathVariable long id){
        this.courseService.deleteCourse(id);
    }
}
