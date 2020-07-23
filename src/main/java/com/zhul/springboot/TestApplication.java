package com.zhul.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration//启用SpringBoot应用的自动配置
//@ComponentScan// 类似于<context:component-scan base-package=""> 扫描该类所在的包，以及它的子子孙孙包
@SpringBootApplication //使用组合注解，相当于@EnableAutoConfiguration @ComponentScan
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
        System.out.println("----------Run Sussess--------------");
    }
}
