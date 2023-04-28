package com.microservice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice1.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
