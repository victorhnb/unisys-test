package com.unisys.unisys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisys.unisys.models.Task;


public interface TaskRepository extends JpaRepository<Task, Integer>{

	Task findById(int id);	
}
