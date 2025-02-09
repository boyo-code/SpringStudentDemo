package com.example.StudentDemo.Student;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> { Student boyo= new Student(
                "boyo",
                "boyo@me.com",
                LocalDate.of(1997,8,30),
                27);
            Student dylan= new Student(
                    "dylan",
                    "dylan@me.com",
                    LocalDate.of(1994,8,30),
                    27);
repository.saveAll(
        List.of(boyo,dylan)
);
        };
    }
}
