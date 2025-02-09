package com.example.StudentDemo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
       return studentRepository.findAll();
    }


    public void addStudent(Student student) {
        Optional<Student> studentoptional=
                studentRepository.findByEmail(student.getEmail());
    if(studentoptional.isPresent()){
        throw new IllegalStateException("email exist already");
    }
    studentRepository.save(student);

    }
}
