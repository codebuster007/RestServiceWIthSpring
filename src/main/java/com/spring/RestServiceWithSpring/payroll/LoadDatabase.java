package com.spring.RestServiceWithSpring.payroll;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            log.info("Pre-loading " + repository.save(new Employee("Victor Jo", "Software Engineer")));
            log.info("Pre-loading " + repository.save(new Employee("Erhi Da Hoe", "Chief Gaming Engineer")));
        };
    }
}
