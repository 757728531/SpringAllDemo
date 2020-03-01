package com.springboot.mysql2dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Mysql2StudentMapper {
	List<Map<String, Object>> getAllStudents();
}
