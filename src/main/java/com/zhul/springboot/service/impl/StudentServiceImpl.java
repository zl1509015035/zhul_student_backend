package com.zhul.springboot.service.impl;


import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhul.springboot.mapper.dsone.StudentMapper;
import com.zhul.springboot.model.Student;
import com.zhul.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public Student getStudentInfoById1(String id) {
        Map map = JSON.parseObject(id,Map.class);
        System.out.println(map.get("id"));
        return  studentMapper.getStudentInfoById((String) map.get("id"));
  }

    @Override
    public Student getStudentInfoById2(String id) {
        return  studentMapper.getStudentInfoById(id);
  }

    @Override
    public Student getStudentInfoByCondition(String id,String name,String address,String age,String grade) {
        return studentMapper.getStudentInfoByCondition(id,name,address,age,grade);
    }


    @Override
    public void writeStudentInfo() {
        String fileName = path + "\\学生信息表" + ".xlsx";

        EasyExcel.write(fileName, Student.class).sheet("模板").doWrite(studentMapper.getStudentInfo());
    }
}
