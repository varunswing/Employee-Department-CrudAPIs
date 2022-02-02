package com.example.demo.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Department;
import com.example.demo.repository.DepartmentRepository;

@Configuration
public class DepartmentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner1(DepartmentRepository departmentRepository) {
		return args -> {
			Department d1=new Department("Fastag", "Manisha Rathore");
			Department d2=new Department("paymetn", "Vibhor Agrawal");
			departmentRepository.saveAll(List.of(d1, d2));
		};
	}
	
}
