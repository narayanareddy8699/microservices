package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.clients.DepartmentClientService;
import com.student.dao.StudentRepository;
import com.student.model.Student;
import com.student.service.StudentService;
import com.student.vo.DepartmentVO;
import com.student.vo.FinalResponse;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired StudentService service;
	
	@Autowired
	DepartmentClientService clientService;
	
	@RequestMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@RequestMapping("/get/{id}")
	public 		FinalResponse getStudent(@PathVariable("id") Long id) {
		Student student= service.getStudent(id);
		DepartmentVO vo=clientService.getDepartment(student.getDeptId());
		FinalResponse finalResponse=new FinalResponse();
		finalResponse.setDepartmentVO(vo);
		finalResponse.setStudent(student);
		return finalResponse;
	}

}
