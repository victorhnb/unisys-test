package com.unisys.unisys.models;

	
	
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOBS")


public class Job implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private boolean active;
	private int [] tasks;

	
	public Job(){
		
	}


	
		public Job(Integer id, String name, boolean active, int[] tasks) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.tasks = tasks;
	}










	public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}





	public int[] getTasks() {
		return tasks;
	}





	public void setTasks(int[] tasks) {
		this.tasks = tasks;
	}


	
}
	
	
	
	

