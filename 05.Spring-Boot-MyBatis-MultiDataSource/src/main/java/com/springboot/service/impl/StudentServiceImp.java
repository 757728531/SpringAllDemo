package com.springboot.service.impl;

import java.util.List;
import java.util.Map;

import com.springboot.mysql2dao.Mysql2StudentMapper;
import org.springframework.stereotype.Service;

import com.springboot.mysqldao.MysqlStudentMapper;

import com.springboot.service.StudentService;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImp implements StudentService{
	@Resource
	private Mysql2StudentMapper mysql2StudentMapper;
	@Resource
	private MysqlStudentMapper mysqlStudentMapper;
	
	@Override
	public List<Map<String, Object>> getAllStudentsFromOralce() {
		return this.mysql2StudentMapper.getAllStudents();
	}

	@Override
	public List<Map<String, Object>> getAllStudentsFromMysql() {
		return this.mysqlStudentMapper.getAllStudents();
	}

}
