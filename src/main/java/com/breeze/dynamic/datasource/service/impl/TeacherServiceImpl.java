package com.breeze.dynamic.datasource.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breeze.dynamic.datasource.annotation.DataSource;
import com.breeze.dynamic.datasource.config.DataSourceEnum;
import com.breeze.dynamic.datasource.entity.Student;
import com.breeze.dynamic.datasource.entity.Teacher;
import com.breeze.dynamic.datasource.mapper.TeacherMapper;
import com.breeze.dynamic.datasource.service.StudentService;
import com.breeze.dynamic.datasource.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description :
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Override
    @DataSource(DataSourceEnum.DB2)
    public boolean save(Teacher entity) {
        return super.save(entity);
    }

    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<Teacher> list(Wrapper<Teacher> queryWrapper) {
        return super.list(queryWrapper);
    }

}
