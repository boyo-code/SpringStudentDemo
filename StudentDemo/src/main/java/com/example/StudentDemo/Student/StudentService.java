package com.example.StudentDemo.Student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(1,"boyo","boyo@me.com",
                LocalDate.of(1997,8,30),
                27));
    }
}
