package com.baich.authmgmt.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-11-20
 * Time : 23:31
 * Description:
 * Modified By:
 * version : v1.0
 */
@Configuration
@MapperScan(basePackages = {"com.baich.authmgmt.mapper"}, sqlSessionTemplateRef = "authJdbcTemplate")

public class DatasourceConfig {

    private String url;
    private String user;
    private String password;
    private String driverClassName;
    private int minIdle;
    private int maxPoolSize;
    private int maxWait;
    private String testQuery;


    @Bean(name = "authDatasource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.auth-mgmt-source")
    public DataSource authDataSource() {
//        DataSource dataSource = new DruidDataSource();
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(url);
        hikariDataSource.setUsername(user);
        hikariDataSource.setPassword(password);
        hikariDataSource.setDriverClassName(driverClassName);
        hikariDataSource.setMinimumIdle(minIdle);
        hikariDataSource.setMaxLifetime(maxWait);
        hikariDataSource.setMaximumPoolSize(maxPoolSize);
        hikariDataSource.setConnectionTestQuery(testQuery);
        return hikariDataSource;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public String getTestQuery() {
        return testQuery;
    }

    public void setTestQuery(String testQuery) {
        this.testQuery = testQuery;
    }

    @Primary
    @Bean(name = "authDatasourceProperties")
    public DataSourceProperties authDatasourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "authDatasource")
    public DataSource authDatasource(@Qualifier("authDatasourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "authJdbcTemplate")
    public JdbcTemplate authJdbcTemplate(@Qualifier("authDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
