package com.example.AI.service;

import com.example.AI.entity.Student;
import com.example.AI.entity.Address;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>(Arrays.asList(
        new Student(1, "Alice", 20, "alice@example.com", "1234567890", Arrays.asList(
            new Address("123 Main St", "Springfield", "IL", "62704", "USA"),
            new Address("456 Oak St", "Springfield", "IL", "62705", "USA")
        )),
        new Student(2, "Bob", 22, "bob@example.com", "0987654321", Arrays.asList(
            new Address("789 Pine St", "Chicago", "IL", "60601", "USA"),
            new Address("101 Maple St", "Chicago", "IL", "60602", "USA")
        ))
    ));

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> addStudent(Student addStudent) {
        for (Student student : students) {
            if (student.getId() != addStudent.getId()) {
            	 students.add(addStudent);
            }
        }
        return students;
    }

    public List<Student> updateStudent(Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == updatedStudent.getId()) {
                students.set(i, updatedStudent);
                return students;
            }
        }
        return students;
    }
}
