package com.zhul.springboot.service;

import com.zhul.springboot.model.Student;

import java.util.List;


public interface StudentService {

    List<Student> getStudentInfo();
    void writeStudentInfo();
}
