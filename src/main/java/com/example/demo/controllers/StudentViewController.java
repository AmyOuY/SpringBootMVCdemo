package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.interfaces.StudentRepository;
import com.example.demo.models.Student;

@Controller
public class StudentViewController {

	private final StudentRepository repo;

	@Autowired
	public StudentViewController(StudentRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	@RequestMapping("/student")
	public ModelAndView getStudents() {
		ModelAndView mv = new ModelAndView("allStudents.jsp");
		
		List<Student> students = repo.findAll();	
		mv.addObject("students", students);
			
		return mv;
	}
	


	@RequestMapping("/studentDetail:id={studentId}")
	public ModelAndView getStudent(@PathVariable int studentId) {
		
		ModelAndView mv = new ModelAndView("viewStudent.jsp");
		
		Student student = repo.findById(studentId).orElse(null);
				
		mv.addObject("student", student);
		
		return mv;
	}
	
	
	
	@RequestMapping("/newStudent")
	public String newStudent() {
		
		return "newStudent.jsp";
	}
	
		
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		
		repo.save(student);
		
		return "newStudent.jsp";
	}
	
	
	
	@RequestMapping("/editStudent:id={studentId}")
	public ModelAndView editStudent(@PathVariable int studentId) {
		
		ModelAndView mv = new ModelAndView("editStudent.jsp");
		
		Student student = repo.findById(studentId).orElse(null);
				
		mv.addObject("student", student);
		
		return mv;
		
	}
	
	
	
	@RequestMapping("/updateStudent")
	public String updateStudent(Student student) {
		repo.save(student);
		
		return "redirect:/student";
	}
	
	
	
	@RequestMapping("/deleteStudent:id={studentId}")
	public String deleteStudent(@PathVariable int studentId) {
		Student student = repo.getById(studentId);
		
		repo.delete(student);
		
		return "redirect:/student";
	}
}
