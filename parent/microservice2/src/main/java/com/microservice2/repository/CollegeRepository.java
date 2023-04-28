package com.microservice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice2.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
