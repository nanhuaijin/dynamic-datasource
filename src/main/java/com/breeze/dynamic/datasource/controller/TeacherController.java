package com.breeze.dynamic.datasource.controller;

import com.breeze.dynamic.datasource.entity.Teacher;
import com.breeze.dynamic.datasource.service.TeacherService;
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
@Api(tags = "教师Controller")
@RestController
@RequestMapping("/admin/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "添加老师")
    @PostMapping("/add")
    public String add(@RequestBody Teacher teacher){
        return this.teacherService.save(teacher) ? "添加成功" : "添加失败";
    }

    @ApiOperation(value = "查询老师")
    @GetMapping("/list")
    public List<Teacher> list(){
        return teacherService.list(null);
    }
}
