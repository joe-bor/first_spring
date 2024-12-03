package com.example.demo.services;

import com.example.demo.models.Course;
import com.example.demo.repositories.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseService {
    private CourseRepository courseRepository;

    // create
    public Course addCourse(Course course) {
        return this.courseRepository.save(course);
    }

    // read
    public List<Course> getAllCourses() {
        return this.courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        Optional<Course> optionalCourse = this.courseRepository.findById(id);
        return optionalCourse.orElse(null);
    }

    // update
    public void updateCourse(Course course, Long id) {
        Course courseById = getCourseById(id);
        courseById.setName(course.getName());
        courseById.setDescription(course.getDescription());
        courseById.setAvgGrade(course.getAvgGrade());
        courseRepository.save(courseById);
    }

    // delete
    public void deleteCourse(long id) {
        Course courseById = getCourseById(id);
        if (courseById != null) courseRepository.delete(courseById);
    }

}
