package com.microservice2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class College {

	@Id
	private int id;
	private String name;

}
