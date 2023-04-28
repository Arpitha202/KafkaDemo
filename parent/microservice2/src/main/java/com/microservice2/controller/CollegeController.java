package com.microservice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice2.entity.College;
import com.microservice2.repository.CollegeRepository;

@RestController
@RequestMapping("/api")
public class CollegeController {

	@Autowired
	KafkaProducer kafkaProducer;

	@Autowired
	CollegeRepository repository;

	@PostMapping("/add")
	public College addStudent(@RequestBody College student) {
		kafkaProducer.sendMessage(student);
		return repository.save(student);

	}

	@GetMapping("/getStudent")
	public List<College> getStudent() {
		return repository.findAll();

	}

}
