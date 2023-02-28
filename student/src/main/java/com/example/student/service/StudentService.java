package com.example.student.service;

import com.example.student.model.Student;

public interface StudentService
{

	public void saveStudent(Student student);
	
	public void deleteStudent(int id);
	
	public Student selectStudent(int id);
	
	public void updateStudent(Student student,int id);
}
