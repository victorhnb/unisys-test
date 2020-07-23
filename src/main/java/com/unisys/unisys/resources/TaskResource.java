package com.unisys.unisys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.unisys.models.Task;
import com.unisys.unisys.repository.TaskRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/task")
@CrossOrigin(origins="*")
public class TaskResource {

	@Autowired
	TaskRepository taskRepository;

	//Metodo que realiza requisição GET de todas ask TASKS  via API no banco
	@GetMapping("/tasks")
	@ApiOperation(value="Return a list of Jobs")
	public List<Task> listTasks() {
		return taskRepository.findAll();

	}

	
	//Metodo que possibilita realizar requisições de um TASK do tipo GET via API por um unico ID
	@GetMapping("/tasks/{id}")
	@ApiOperation(value="Return an unique task")
	public Task listTasksUnique(@PathVariable(value = "id") int id) {
		return taskRepository.findById(id);
	}
	
	//Metodo que possibilita realizar um post de um TASK via API utilizando RequestBody
	@PostMapping("/tasks")
	@ApiOperation(value="Save a task")
	public Task saveTask(@RequestBody Task task) {
		return taskRepository.save(task);
	}
	
	//Deleta uma TASK recebendo como parametro um JSON utilzando RequestBody
	@DeleteMapping("/tasks")
	@ApiOperation(value="Delete a task")
	public void deleteTask(@RequestBody Task task) {
		taskRepository.delete(task);		
	}

	//Metodo que atualiza uma Task no banco via API 
	@PutMapping("/tasks")
	@ApiOperation(value="Update a task")
		public Task updateJob(@RequestBody Task task) {
		return taskRepository.save(task);
	}

}