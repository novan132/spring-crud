package com.novan.cruddemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService{
    @Override
    public Student save(Student s) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student update(Student s) {
        return null;
    }

    @Override
    public void delete(String email) {

    }
}
