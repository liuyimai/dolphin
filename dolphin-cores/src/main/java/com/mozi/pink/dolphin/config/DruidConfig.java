package com.mozi.pink.dolphin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuyimai
 * @Date: 2021/1/30/0030 20:07
 * @Desc:
 */
@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource getDruidDS() {
        return new DruidDataSource();
    }

}
