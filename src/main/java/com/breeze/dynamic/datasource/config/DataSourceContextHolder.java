package com.breeze.dynamic.datasource.config;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description : 数据源上下文对象 - 主要配置threadLocal
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();

    /**
     * 设置数据源
     */
    public static void setDataSource(String dbName) {
        contextHolder.set(dbName);
    }

    /**
     * 获取当前数据源名称
     * @return
     */
    public static String getDataSource() {
        return contextHolder.get();
    }

    /**
     * 消除上下文数据
     */
    public static void clear() {
        contextHolder.remove();
    }
}
