package com.breeze.dynamic.datasource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.dynamic.datasource.entity.Student;
import com.breeze.dynamic.datasource.mapper.StudentMapper;
import com.breeze.dynamic.datasource.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description :
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
