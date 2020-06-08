# 使用AOP配置动态数据源

#### 前沿：时间很短天涯很远。往后的一山一水一朝一夕，自己安静地走完。

#### 一、环境配置

1. jdk 1.8
2. maven 3.5.4
3. mybatis-plus 3.0.5

#### 二、项目流程

1. pom文件
2. application.yml文件
3. 主启动类
4. Swagger2Config
5. DruidConfig
6. DataSourceEnum配置数据源名称的枚举类
7. DataSource注解
8. DataSourceContextHolder存放ThreadLocal对象
9. DataSourceAspect切面类
10. MultipleDataSource多数据源类
11. MyBatisPlusConfig
12. entity实体类
13. MVC三层架构

