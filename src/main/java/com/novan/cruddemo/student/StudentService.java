package com.novan.cruddemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
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
