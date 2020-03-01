package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Student;
import com.springboot.service.StudentService;

import java.sql.Struct;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping( value = "/querystudent", method = RequestMethod.GET)
	public Student queryStudentBySno(String sno) {
		return this.studentService.queryStudentBySno(sno);
	}

	@RequestMapping(value = "/insertstudent")
	public void insertstudent(String sno, String name,String sex){
		Student student=new Student();
		student.setSno(sno);
		student.setName(name);
		student.setSex(sex);
		studentService.add(student);
	}

}
