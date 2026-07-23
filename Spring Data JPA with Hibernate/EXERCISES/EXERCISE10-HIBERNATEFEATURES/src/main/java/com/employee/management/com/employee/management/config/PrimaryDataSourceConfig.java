package com.employee.management.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

@Configuration
public class PrimaryDataSourceConfig {

    @Bean

    @Primary

    @ConfigurationProperties("spring.datasource")

    public DataSourceProperties dataSourceProperties() {

        return new DataSourceProperties();

    }

    @Bean

    @Primary

    public DataSource dataSource() {

        return dataSourceProperties()

                .initializeDataSourceBuilder()

                .build();

    }

}