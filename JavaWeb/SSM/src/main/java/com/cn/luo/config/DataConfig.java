package com.cn.luo.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Created by Luther on 2017/4/16.
 */
@Configuration
@MapperScan(basePackages = "com.cn.luo.mapper")
public class DataConfig {

    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=utf-8");//防止乱码
        dataSource.setUsername("root");
        dataSource.setPassword("Root2017");
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(10);
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.cn.luo.model");
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return sessionFactory;
    }
}