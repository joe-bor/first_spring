package com.example.demo.services;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public Student getStudentById(long id) {
        Optional<Student> optionalStudent = this.studentRepository.findById(id);
        return optionalStudent.orElse(null);
    }

    public Student addStudent(Student student) {
        return this.studentRepository.save(student);
    }

    public boolean updateStudent(Student student, long id) {
        Student studentById = getStudentById(id);
        if (studentById != null) {
            studentById.setName(student.getName());
            studentById.setEmail(student.getEmail());
            studentById.setAge(student.getAge());
            this.studentRepository.save(studentById);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(long id) {
        Student studentById = getStudentById(id);
        if (studentById != null) {
            this.studentRepository.delete(studentById);
            return true;
        }
        return  false;
    }
}
