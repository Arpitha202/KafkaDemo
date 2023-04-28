package com.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservice1.entity.Student;
import com.microservice1.repository.StudentRepository;

@SpringBootApplication
public class Microservice1Application {

	
	
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Student student=new Student();
//		student.setId(3);
//		student.setName("kavya");
//		repository.save(student);
//	}

}
