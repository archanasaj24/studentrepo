package com.example.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dao.StudentRepository;
import com.example.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student selectStudent(int id) {
		Optional<Student> optional=studentRepo.findById(id);
		Student student=optional.get();
		return student;
	}

	@Override
	public void updateStudent(Student student, int id) {
		Optional<Student> optional=studentRepo.findById(id);
		Student stud=optional.get();
		stud.setStudName(student.getStudName());
		stud.setStudCity(student.getStudCity());
		stud.setStudMobileNo(student.getStudMobileNo());
		studentRepo.save(stud);
		
	}

}
