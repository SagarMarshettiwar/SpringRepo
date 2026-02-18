package com.example.AI.controller;

import com.example.AI.entity.Student;
import com.example.AI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public List<Student> addStudent(@RequestBody Student addStudent) {
        return studentService.addStudent(addStudent);
    }

    @PutMapping
    public List<Student> putStudent(@RequestBody Student updatedStudent) {
        return studentService.updateStudent(updatedStudent);
    }
}