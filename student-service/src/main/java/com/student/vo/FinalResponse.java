package com.student.vo;

import com.student.model.Student;

public class FinalResponse {

	private Student student;
	private DepartmentVO departmentVO;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public DepartmentVO getDepartmentVO() {
		return departmentVO;
	}

	public void setDepartmentVO(DepartmentVO departmentVO) {
		this.departmentVO = departmentVO;
	}

}
