package com.practice.appone.controller;

import com.practice.appone.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("/students")
@RestController
public class StudentController {

    @GetMapping("")
    public List<Student> getAll() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "first1", "second1"));
        students.add(new Student(2, "first2", "second2"));
        students.add(new Student(3, "first3", "second3"));

        return students;
    }

    @GetMapping("/single")
    public Student getStudent() {
        System.out.println("single student");
        return new Student(1, "firstName1", "secondName1");
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return new Student(id, "first", "second");
    }
}
