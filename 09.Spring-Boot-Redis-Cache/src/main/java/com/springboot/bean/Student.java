package com.springboot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = -339516038496531943L;
	@TableField("SNO")
	private String sno;
	@TableField("SNAME")
	private String name;
	@TableField("SSEX")
	private String sex;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
