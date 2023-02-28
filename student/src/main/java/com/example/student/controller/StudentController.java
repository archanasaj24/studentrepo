package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentServiceImpl;

@RestController
public class StudentController
{

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student)
	{
		studentServiceImpl.saveStudent(student);
		return "Record saved";
	}
	
	@DeleteMapping("/delete/{id1}")
	public String deleteStudent(@PathVariable("id1") int id)
	{
		studentServiceImpl.deleteStudent(id);
		return "Record deleted";
	}
	
	@GetMapping("/select/{id1}")
	public Student selectStudent(@PathVariable("id1") int id)
	{
		Student student=studentServiceImpl.selectStudent(id);
		return student;
	}
	
	@PutMapping("/update/{id1}")
	public String updateStudent(@PathVariable("id1") int id, @RequestBody Student student)
	{
		studentServiceImpl.updateStudent(student, id);
		return "Record updated";
	}
		
}
