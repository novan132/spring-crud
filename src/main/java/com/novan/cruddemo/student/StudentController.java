package com.novan.cruddemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
//    @Autowired
    private StudentService service;

    public StudentController(
            /*@Qualifier("DBStudentService")*/ StudentService service
    ) {
        this.service = service;
    }

    @PostMapping
    public Student save(
            @RequestBody Student s
    ) {
        return service.save(s);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable String email
    ) {
        return service.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(
            @RequestBody Student s
    ) {
        return service.update(s);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable String email
    ) {
        service.delete(email);
    }
}
