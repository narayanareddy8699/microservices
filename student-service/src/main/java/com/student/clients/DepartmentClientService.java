package com.student.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.student.vo.DepartmentVO;

@Component
public class DepartmentClientService {
	
	@Autowired RestTemplate template;
	
	public DepartmentVO getDepartment(String id) {
		return template.getForObject("http://localhost:8090/departments/get/"+id, DepartmentVO.class);
	}

}
