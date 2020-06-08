package com.breeze.dynamic.datasource.aspect;

import com.breeze.dynamic.datasource.annotation.DataSource;
import com.breeze.dynamic.datasource.config.DataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description : 切面类
 */
@Component
@Slf4j
@Aspect
@Order(-1)
public class DataSourceAspect {

    @Pointcut("@within(com.breeze.dynamic.datasource.annotation.DataSource) " +
            "|| @annotation(com.breeze.dynamic.datasource.annotation.DataSource)")
    public void pointCut() {}

    /**
     * 前置通知 - 设置数据源
     * @param dataSource
     */
    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource) {
        log.info("选择数据源----" + dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value().getValue());
    }

    /**
     * 清空ThreadLocal
     */
    @After("pointCut()")
    public void doAfter() {
        DataSourceContextHolder.clear();
    }

}
