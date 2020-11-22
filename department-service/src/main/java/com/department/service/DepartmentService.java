package com.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.dao.DepartmentRepository;
import com.department.model.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepo;

	public Department saveDepartment(Department department) {
		System.out.println("In Service");
		return departmentRepo.save(department);
	}

	public Department getDepartment(Long  id) {
		Optional<Department> dept = departmentRepo.findById(id);
		return dept.get();
	}

}
