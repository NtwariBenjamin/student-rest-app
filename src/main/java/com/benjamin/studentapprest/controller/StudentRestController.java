package com.benjamin.studentapprest.controller;

import com.benjamin.studentapprest.model.Student;
import com.benjamin.studentapprest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    private StudentService service;
    @PostMapping("student")
    public Student addStudent(@RequestBody Student student){
        service.addStudent(student);
        return service.getStudent(student.getStudentId());
    }
    @GetMapping("students")
    public List<Student> getAllStudents(Student student){
        return service.getAllStudents();
    }

    @GetMapping("student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return service.getStudent(studentId);
    }

    @PutMapping("student")
    public Student updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        return service.getStudent(student.getStudentId());
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudent(@PathVariable int studentId){
        return service.deleteStudent(studentId);
    }
}
