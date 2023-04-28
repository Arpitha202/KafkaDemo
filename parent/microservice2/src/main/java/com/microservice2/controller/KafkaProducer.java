package com.microservice2.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


import com.microservice2.entity.College;

@Service
public class KafkaProducer {
	private String topicName = "producer1";
	

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;



	public void sendMessage(College student) {
		Message<College> message = MessageBuilder.withPayload(student).setHeader(KafkaHeaders.TOPIC, topicName)
				.build();
		kafkaTemplate.send(message);

	}
}
