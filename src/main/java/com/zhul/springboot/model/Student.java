package com.zhul.springboot.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author zhul
 */
@Data
public class Student {
    @ExcelProperty("序号")
    private Integer stuId;

    @ExcelProperty("学生姓名")
    private String stuName;

    @ExcelProperty("学生年龄")
    private String stuAge;

    @ExcelProperty("学生年级")
    private String stuGrade;

    @ExcelProperty("学生家庭地址")
    private String stuAddress;

    @ExcelProperty("学生电话")
    private String stuPhone;

}
