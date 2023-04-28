package com.microservice1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
	private String topicName = "producer1";
	

	@Bean
	public NewTopic topic() {

		return TopicBuilder.name(topicName).partitions(1).replicas(2).build();
	}


}
