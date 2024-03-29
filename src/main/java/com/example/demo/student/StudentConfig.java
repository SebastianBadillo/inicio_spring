package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
/*Here we add to the database*/
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(

                    "mariam",
                    "m@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student alex = new Student(

                    "alex",
                    "a@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );
            repository.saveAll(List.of(mariam,alex));

        };
    }
}
