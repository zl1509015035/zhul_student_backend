package com.zhul.springboot.service;

import com.zhul.springboot.model.Student;

import java.util.List;


public interface TestRestTemplateService {

     List<Student> testSelectSubscribe();

     public Student testSelectById(String id);

     List<Student> testSelectSubscribeByPost();

     public Student testSelectByIdPost3(String id,String name,String address,String age,String grade);

}
