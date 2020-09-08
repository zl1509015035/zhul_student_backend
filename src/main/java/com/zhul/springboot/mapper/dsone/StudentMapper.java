package com.zhul.springboot.mapper.dsone;

import com.zhul.springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentMapper {

    List<Student> getStudentInfo();

    Student getStudentInfoById(String id);

    Student getStudentInfoByCondition(String id,String name,String address,String age,String grade);
}
