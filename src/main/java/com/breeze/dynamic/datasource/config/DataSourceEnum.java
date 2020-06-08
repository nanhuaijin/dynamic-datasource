package com.breeze.dynamic.datasource.config;

/**
 * @author : breeze
 * @date : 2020/6/8
 * @description : DataSource数据源常量枚举类
 */
public enum DataSourceEnum {
    /**
     * 数据源1名称
     */
    DB1("db1"),
    /**
     * 数据源2名称
     */
    DB2("db2");

    private final String value;

    DataSourceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
