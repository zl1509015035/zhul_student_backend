package com.zhul.springboot.mapper.dsone;

import com.zhul.springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentMapper {

    List<Student> getStudentInfo();
}
