package com.zhul.springboot.controller;

import com.zhul.springboot.model.Student;
import com.zhul.springboot.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhul
 */
@RestController
@RequestMapping("/student")
@Api(tags = "学生处")
public class StudentController {

    @Autowired
    StudentService studentService;

    @ApiOperation("获得学生所有信息")
    @PostMapping("/getStudentInfo")
    public List<Student> getStudentInfo() {
        return studentService.getStudentInfo();
    }

    @ApiOperation("将学生信息导出excel")
    @PostMapping("/writeStudentInfo")
    public void writeStudentInfo(){
        studentService.writeStudentInfo();
    }
}
