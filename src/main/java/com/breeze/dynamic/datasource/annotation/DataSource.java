package com.breeze.dynamic.datasource.annotation;

import com.breeze.dynamic.datasource.config.DataSourceEnum;

import java.lang.annotation.*;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description : 动态切换数据源注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    DataSourceEnum value() default DataSourceEnum.DB1;
}
