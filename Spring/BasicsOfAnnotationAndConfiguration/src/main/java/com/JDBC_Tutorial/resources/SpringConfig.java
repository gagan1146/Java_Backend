package com.JDBC_Tutorial.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


//DriverManagerDataSource
//JdbcTemplate
//NamedParameterJdbcTemplate

@Configuration
public class SpringConfig {
    @Bean
    public DriverManagerDataSource myDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        return driverManagerDataSource;
    }

}
