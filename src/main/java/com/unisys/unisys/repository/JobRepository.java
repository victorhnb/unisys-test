package com.unisys.unisys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisys.unisys.models.Job;



public interface JobRepository extends JpaRepository<Job, Integer>{

	Job findById(int id);	
}
