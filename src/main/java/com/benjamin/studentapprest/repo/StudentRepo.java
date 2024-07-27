package com.benjamin.studentapprest.repo;

import com.benjamin.studentapprest.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepo {

        List<Student> students=new ArrayList<>(Arrays.asList(
                new Student( 1,"Benjamin Ntwari","Kimironko",25),
                new Student(2,"Dr Chris","Poland",26),
                new Student(3,"Eddy Ishimwe","Germany",25),
                new Student(4,"David Mugisha","USA",27)
        ));


    public Student getStudent(int studentId) {
        for (Student student: students){
            if (student.getStudentId()== studentId){
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public void updateStudent(Student student) {
        for (Student student1: students){
            if (student1.getStudentId()==student.getStudentId()){
                student1.setStudentNames(student.getStudentNames());
                student1.setStudentAddress(student.getStudentAddress());
                student1.setStudentAge(student.getStudentAge());
            }
        }

    }

    public String deleteStudent(int studentId) {
        for (Student student: students){
            if (student.getStudentId()==studentId){
                students.remove(student);
            }
        }
        return "Student Deleted!";
    }
}
