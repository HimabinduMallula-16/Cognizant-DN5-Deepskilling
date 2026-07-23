package com.employee.management.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

@Configuration
public class SecondaryDataSourceConfig {

    @Bean

    @ConfigurationProperties("department.datasource")

    public DataSourceProperties secondProperties() {

        return new DataSourceProperties();

    }

    @Bean(name="departmentDataSource")

    public DataSource secondDataSource() {

        return secondProperties()

                .initializeDataSourceBuilder()

                .build();

    }

}