package com.benjamin.studentapprest.service;

import com.benjamin.studentapprest.model.Student;
import com.benjamin.studentapprest.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;
    public void addStudent(Student student) {
        repo.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student getStudent(int studentId) {
        return repo.getStudent(studentId);
    }


    public void updateStudent(Student student) {
        repo.updateStudent(student);
    }

    public String deleteStudent(int studentId) {
        repo.deleteStudent(studentId);
        return "Deleted";
    }
}
