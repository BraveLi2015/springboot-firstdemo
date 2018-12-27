package com.baizhi.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@EnableConfigurationProperties(JDBCProperties.class)*/
public class JavaConfig {
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DruidDataSource getDruidDataSource() {
        return new DruidDataSource();
    }
}
