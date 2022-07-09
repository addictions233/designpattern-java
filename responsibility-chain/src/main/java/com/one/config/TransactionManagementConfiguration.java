package com.one.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @author one
 */
@SpringBootConfiguration
@EnableTransactionManagement // 注解用于开启事务
public class TransactionManagementConfiguration implements TransactionManagementConfigurer {
    
    @Autowired
    private DataSource dataSource;
    
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
