package com.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice1.entity.College;
import com.microservice1.repository.CollegeRepository;


@Service
public class KafkaConsumer1 {

	@Autowired
	CollegeRepository repository;

	@KafkaListener(topics = "producer1", groupId = "group1")
	public void consume(String message) throws JsonMappingException, JsonProcessingException {
		String jsonString = message;

		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// convert JSON string to object
		College college = objectMapper.readValue(jsonString, College.class);

		// print object properties
//		System.out.println(student.getId()); // 9
//		System.out.println(student.getName());
		repository.save(college);
		System.out.println(message);
	}

}
