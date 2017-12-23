package com.luo.test;

import cn.luo.mybatis.MultipleDataSource;
import cn.luo.mybatis.dao.mapper.MySqlMapper;
import cn.luo.mybatis.dao.mapper.SQLiteMapper;
import cn.luo.mybatis.dao.mapper.SqlServerMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void getList() {
        //初始化ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");

//        MySqlMapper mySqlMapper = applicationContext.getBean(MySqlMapper.class);
//        SqlServerMapper sqlServerMapper = applicationContext.getBean(SqlServerMapper.class);
        SQLiteMapper sqLiteMapper = applicationContext.getBean(SQLiteMapper.class);

        //设置数据源为MySql,使用了AOP测试时请将下面这行注释
//        MultipleDataSource.setDataSourceKey("mySqlDataSource");
//        mySqlMapper.getList();
        //设置数据源为SqlServer,使用AOP测试时请将下面这行注释
//        MultipleDataSource.setDataSourceKey("sqlServerDataSource");
//        sqlServerMapper.getList();
        //设置数据源为SQLite,使用AOP测试时请将下面这行注释
        MultipleDataSource.setDataSourceKey("sqliteDataSource");
        List<Map<String, Object>> list = sqLiteMapper.getList();
        System.out.println(list);
    }
}
