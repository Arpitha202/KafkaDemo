package com.microservice1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class College {

	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Student> students;

}
