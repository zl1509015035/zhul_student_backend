package com.zhul.springboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhul.springboot.model.Student;
import com.zhul.springboot.service.TestRestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestRestTemplateServiceImpl implements TestRestTemplateService {

    @Autowired
    RestTemplate restTemplate;

    String urlAll = "http://127.0.0.1:8081/student/getStudentInfo";
    String urlId = "http://127.0.0.1:8081/student/getStudentInfoById1";

    String urlAllPost = "http://127.0.0.1:8081/student/getStudentInfoPost";


    @Override
    public List<Student> testSelectSubscribe() {

        //请求入参
        Map<String, Object> paramMap = new HashMap<>();
        String response = restTemplate.getForObject(urlAll, String.class);
        List<Student> list = JSON.parseArray(response, Student.class);
        return list;
    }


    public Student testSelectById(String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf("application/json;UTF-8"));
        //入参
        JSONObject json = new JSONObject();
        json.put("id", id);
//        System.out.println(json);
//        HttpEntity<String> request = new HttpEntity<>(json.toString(), headers);
        String response = restTemplate.getForObject("http://127.0.0.1:8081/student/getStudentInfoById?id={id}", String.class, json);
        Student student = JSON.parseObject(response, Student.class);
        return student;
    }

    @Override
    public List<Student> testSelectSubscribeByPost() {
        //请求入参
        Map<String, Object> paramMap = new HashMap<>();
        String response = restTemplate.postForObject(urlAllPost, paramMap, String.class);
        List<Student> list = JSON.parseArray(response, Student.class);
        return list;
    }


    @Override
    public Student testSelectByIdPost3(String id,String name,String address,String age,String grade) {
        String urlIdPost = "http://127.0.0.1:8081/student/getStudentInfoByIdPost3";
        MultiValueMap<String,Object> map = new LinkedMultiValueMap<>();
        map.add("id", id);
        map.add("name",name);
        map.add("address",address);
        map.add("age",age);
        map.add("grade",grade);

        String response = restTemplate.postForObject(urlIdPost, map, String.class);
        Student student = JSON.parseObject(response, Student.class);
        return student;
    }


}
