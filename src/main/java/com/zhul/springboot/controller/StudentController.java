package com.zhul.springboot.controller;

import com.zhul.springboot.model.Student;
import com.zhul.springboot.service.StudentService;
import com.zhul.springboot.service.TestRestTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    TestRestTemplateService testRestTemplate;

    @ApiOperation("获得所有学生信息")
    @GetMapping("/getStudentInfo")
    public List<Student> getStudentInfo() {
        return studentService.getStudentInfo();
    }

    @ApiOperation("通过id获得学生所有信息")
    @GetMapping("/getStudentInfoById")
    public Student getStudentInfoById(String  id) {

        return studentService.getStudentInfoById2(id);
    }

    @ApiOperation("通过id获得学生所有信息")
    @PostMapping("/getStudentInfoByIdPost1")
    public Student getStudentInfoByIdPost1(@RequestBody String id) {

        return studentService.getStudentInfoById1(id);
    }

    @ApiOperation("通过id获得学生所有信息")
    @PostMapping("/getStudentInfoByIdPost2")
    public Student getStudentInfoByIdPost2(String id) {

        return studentService.getStudentInfoById2(id);
    }

    @ApiOperation("通过id和姓名获得学生所有信息")
    @PostMapping("/getStudentInfoByIdPost3")
    public Student getStudentInfoByIdPost3(String id,String name,String address,String age,String grade) {

        return studentService.getStudentInfoByCondition(id,name,address,age,grade);
    }

    @ApiOperation("调用接口post3")
    @PostMapping("/testSelectByIdPost3")
    public Student testSelectByIdPost3(String id,String name,String address,String age,String grade) {
        System.out.println("--------------按ID查询POST调用成功-------------------");

        return testRestTemplate.testSelectByIdPost3(id,name,address,age,grade);
    }

/*    @ApiOperation("获得学生所有信息Post")
    @PostMapping("/getStudentInfoPost")
    public List<Student> getStudentInfoPost() {
        return studentService.getStudentInfo();
    }


    @ApiOperation("将学生信息导出excel")
    @GetMapping("/writeStudentInfo")
    public void writeStudentInfo() {
        studentService.writeStudentInfo();
    }*/

    @ApiOperation("调用接口")
    @GetMapping("/testSelectById")
    public Student testSelectById(String id) {
        System.out.println("--------------按ID查询调用成功-------------------");

        return testRestTemplate.testSelectById(id);
    }

/*    @ApiOperation("调用接口全量数据")
    @GetMapping("/testSelectSubscribe")
    public List<Student> testSelectSubscribe() {
        System.out.println("--------------全量数据调用成功-------------------");
        return testRestTemplate.testSelectSubscribe();
    }


    @ApiOperation("调用接口全量数据post")
    @PostMapping("/testSelectSubscribePost")
    public List<Student> testSelectSubscribePost() {
        System.out.println("--------------全量数据POST调用成功-------------------");
        return testRestTemplate.testSelectSubscribeByPost();
    }*/


}
