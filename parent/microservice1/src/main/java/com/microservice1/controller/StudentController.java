package com.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice1.entity.Student;
import com.microservice1.repository.CollegeRepository;
import com.microservice1.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepository repository;
	
	@Autowired
	CollegeRepository collegeRepository;
	
	@PostMapping("/coliege/{id}/students")
	public Student addProduct(@PathVariable Integer id, @RequestBody Student student) {
		return collegeRepository.findById(id).map(college -> {
			student.setCollege(college);
			return repository.save(student);
		}).orElseThrow();
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable Integer id) {
		
		return repository.findById(id).get();
	}
}
