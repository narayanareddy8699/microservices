package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepository;
import com.student.model.Student;

@Service
public class StudentService {
	
	@Autowired StudentRepository studentRepo;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public Student getStudent(Long studentId) {
		return studentRepo.findById(studentId).get();
	}

}
