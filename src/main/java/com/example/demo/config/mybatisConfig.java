/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import javax.sql.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 *
 * @author Leanghour
 */

@Configuration
@MapperScan("com.example.demo.repository")
public class mybatisConfig {
    @Autowired
    private DataSource dataSource;
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean()
    {
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
    
    public DataSourceTransactionManager dataSourceTransactionManager()
    {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean
    public DataSource inMemoryDataSource()
    {
        EmbeddedDatabaseBuilder builder=new EmbeddedDatabaseBuilder();
        builder.setType(EmbeddedDatabaseType.H2)
                .addScript("data/schema.sql").addScript("data/data.sql");
        return builder.build();
    }
}
