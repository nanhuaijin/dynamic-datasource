package com.breeze.dynamic.datasource.controller;

import com.breeze.dynamic.datasource.entity.Student;
import com.breeze.dynamic.datasource.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description :
 */
@Api(tags = "学生Controller")
@RestController
@RequestMapping("/admin/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation("添加学生")
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        return this.studentService.save(student) ? "添加成功" : "添加失败";
    }

    @ApiOperation(value = "查询学生")
    @GetMapping("/list")
    public List<Student> list(){
        return this.studentService.list(null);
    }
}
