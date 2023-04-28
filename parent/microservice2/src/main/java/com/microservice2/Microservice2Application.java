package com.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservice2.entity.College;
import com.microservice2.repository.CollegeRepository;

@SpringBootApplication
public class Microservice2Application implements CommandLineRunner {

	@Autowired
	CollegeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		College college = new College();
		college.setId(1);
		college.setName("Sir MV");
		repository.save(college);

	}

}
