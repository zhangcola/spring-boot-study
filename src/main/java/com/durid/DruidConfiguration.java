package com.durid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 使用java配置druid数据源
 * Created by cola on 2017/1/23.
 */
//@Configuration
public class DruidConfiguration {

    /**
     * 注册statViewServlet
     *
     */
    @Bean
    public ServletRegistrationBean druidStatViewServlet2() {
        ServletRegistrationBean servletRegistrationBean = new
                ServletRegistrationBean(new StatViewServlet(), "/druids/*");

        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        servletRegistrationBean.addInitParameter("deny", "127.0.0.1");
        servletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletRegistrationBean.addInitParameter("loginPassword", "123456");
        servletRegistrationBean.addInitParameter("resetEnable", "false");

        return servletRegistrationBean;
    }

    /**
     * 注册 filterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean druidStatFilter2() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        filterRegistrationBean.addUrlPatterns("/*");

        //添加忽略拦截

        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid2/*");
        return filterRegistrationBean;
    }

    /**
     * 配置DataSource
     */
    @Bean
    public DataSource druidDataSource(
            @Value("${spring.datasource.driverClassName}") String driver,

            @Value("${spring.datasource.url}") String url,

            @Value("${spring.datasource.username}") String username,

            @Value("${spring.datasource.password}") String password,

            @Value("${spring.datasource.maxActive}") int maxActive
    ) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setMaxActive(maxActive);

        try {
            druidDataSource.setFilters("stat, wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return druidDataSource;
    }

}
