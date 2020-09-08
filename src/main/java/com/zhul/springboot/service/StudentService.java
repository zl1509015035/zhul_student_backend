package com.zhul.springboot.service;

import com.zhul.springboot.model.Student;

import java.util.List;


public interface StudentService {

    List<Student> getStudentInfo();

    Student getStudentInfoById1(String id);

    Student getStudentInfoById2(String id);

    Student getStudentInfoByCondition(String id,String name,String address,String age,String grade);

    void writeStudentInfo();
}
