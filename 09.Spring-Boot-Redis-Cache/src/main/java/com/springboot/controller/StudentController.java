package com.springboot.controller;

import com.springboot.bean.Student;
import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/query")
    public Student getStudentBySno(String sno){
        return studentService.queryStudentBySno(sno);
    }

    @RequestMapping("/update")
    public String update(String sno){
        Student student = studentService.queryStudentBySno(sno);
        student.setName("修改");
        studentService.update(student);
        return "修改成功,看下redis";
    }


}
