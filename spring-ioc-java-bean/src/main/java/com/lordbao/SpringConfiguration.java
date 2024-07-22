package com.lordbao;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 21:31
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.lordbao")
@PropertySource("classpath:jdbc.properties")
public class SpringConfiguration {

    @Bean
    public DataSource dataSource1( @Value("${jdbc.driver}") String driver,
                                   @Value("${jdbc.url}") String url,
                                   @Value("${jdbc.username}") String username,
                                   @Value("${jdbc.password}") String password
                                 ){
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(driver);
        source.setUrl(url);
        source.setUsername(username);
        source.setPassword(password);
        return source;
    }

    @Bean
    public DataSource dataSource2( @Value("${jdbc.driver}") String driver,
                                   @Value("${jdbc.url}") String url,
                                   @Value("${jdbc.username}") String username,
                                   @Value("${jdbc.password}") String password
    ){
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(driver);
        source.setUrl(url);
        source.setUsername(username);
        source.setPassword(password);
        return source;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("dataSource1") DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
