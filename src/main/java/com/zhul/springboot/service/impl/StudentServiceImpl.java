package com.zhul.springboot.service.impl;


import com.alibaba.excel.EasyExcel;
import com.zhul.springboot.mapper.dsone.StudentMapper;
import com.zhul.springboot.model.Student;
import com.zhul.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    String path = "D:\\Code\\zhul_student_backend";


    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getStudentInfo() {
        return studentMapper.getStudentInfo();
    }


    @Override
    public void writeStudentInfo() {
        String fileName = path + "\\学生信息表" + ".xlsx";

        EasyExcel.write(fileName, Student.class).sheet("模板").doWrite(studentMapper.getStudentInfo());
    }
}
