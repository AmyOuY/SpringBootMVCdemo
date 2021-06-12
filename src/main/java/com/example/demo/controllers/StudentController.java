package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;


@RestController
public class StudentController {
	
	private final StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return service.getStudents();
	}
	
	
	@GetMapping("/students/{studentId}")
	public Optional<Student> getStudent(@PathVariable int studentId) {
		
		return service.getStudent(studentId);
	}
	
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		
		return service.addStudent(student);
	}
	
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		
		return service.updateStudent(student);
	}
	
	
	@DeleteMapping("/students/{studentId}")
	public String deleteStudent(@PathVariable int studentId) {
		
		return service.deleteStudent(studentId);
	}
}
