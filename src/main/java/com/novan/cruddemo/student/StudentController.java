package com.novan.cruddemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Novan",
                        "Ariadi",
                        LocalDate.now(),
                        "novan@mail.com",
                        40
                ),
                new Student(
                        "Ali",
                        "Nafiah",
                        LocalDate.now(),
                        "ali@mail.com",
                        42
                )
        );
    }
}
