package com.zhul.springboot.controller;

import com.zhul.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import javax.swing.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/show")
    public String test(){
        User user = new User();
        return "hello springboot 1";
    }

}
