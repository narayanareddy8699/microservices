package com.department.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.model.Department;
import com.department.service.DepartmentService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired DepartmentService service;
	
	@RequestMapping(value = "/save",consumes = "application/json",produces = "application/json")
	@ResponseBody
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
		System.out.println("In Controller");
		return  ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(service.saveDepartment(department));
	}
	
	@RequestMapping(value = "/get/{id}",produces = "application/json")
	@ResponseBody
	public ResponseEntity<Department> getDepartment(@PathVariable("id") Long id) {
		return  ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(service.getDepartment(id));
	}

}
