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

import com.unisys.unisys.models.Job;
import com.unisys.unisys.repository.JobRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/job")
@Api(value="API REST Unisys")
@CrossOrigin(origins="*")
public class JobResource {

	@Autowired
	JobRepository jobRepository;
	
	//Metodo que retorna todos os Jobs via API no banco de Dados
	@GetMapping ("/jobs")
	@ApiOperation(value="Return a list of Jobs")
	public List<Job> listJobs (){
		return jobRepository.findAll();
	}
	
	//Metodo que retorna um Job pelo seu id via API no banco de dados
	@GetMapping ("/jobs/{id}")
	@ApiOperation(value="Return an unique job")
	public Job listJobsUnique (@PathVariable(value="id")int id){
		return jobRepository.findById(id);
	}
	
	//Metodo que permite enviar um POST JSON via API 
	@PostMapping("/jobs")
	@ApiOperation(value="Save a Job")
	public Job saveJob(@RequestBody Job job) {
		return jobRepository.save(job);
	}
	
	//Metodo que deleta um job como um JBSON utilizando RequestBody
	@DeleteMapping("/jobs")
	@ApiOperation(value="Delete a job")
	public void deleteJob(@RequestBody Job job) {
		jobRepository.delete(job);		
	}
	
	//Metodo que atualiza um Job no Banco de dados
	@PutMapping("/jobs")
	@ApiOperation(value="Update a job")
	public Job updateJob(@RequestBody Job job) {
		return jobRepository.save(job);
	}
	
	
}
