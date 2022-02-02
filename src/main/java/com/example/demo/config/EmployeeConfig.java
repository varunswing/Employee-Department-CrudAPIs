package com.example.demo.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Employee;
import com.example.demo.repository.EmployeeRepository;

@Configuration
public class EmployeeConfig {
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return args -> {
			Employee e1 = new Employee("Varun", "varun@gmail.com", LocalDate.of(2000, 10, 16), 1);
			Employee e2 = new Employee("Ravi", "ravi@gmail.com", LocalDate.of(2000, 10, 14), 3);
			Employee e3 = new Employee("Amit", "ami@gmail.com", LocalDate.of(2000, 10, 18), 1);
			Employee e4 = new Employee("Mampi", "mampi@gmail.com", LocalDate.of(2000, 10, 26), 2);
			
			employeeRepository.saveAll(List.of(e1, e2, e3, e4));
		};
	}

}
