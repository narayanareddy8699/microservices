package com.department.dao;

import org.springframework.data.repository.CrudRepository;

import com.department.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
