package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.StudentRepository;
import com.example.demo.models.Student;

@Service
public class StudentService {
	private final StudentRepository repo;

	@Autowired
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	
	public List<Student> getStudents(){
		
		return repo.findAll();
	}
	
	
	
	public Optional<Student> getStudent(int studentId) {
			
		return repo.findById(studentId);
					
	}
	
	
	
	public Student addStudent(Student student) {		
		repo.save(student);
		
		return student;
	}
	
	
	
	public Student updateStudent(Student student) {	
		repo.save(student);
		
		return student;
	}
	
	
	public String deleteStudent(int studentId) {
		Student student = repo.getById(studentId);
		
		repo.delete(student);
		
		return "Successfully deleted student";
	}
}
