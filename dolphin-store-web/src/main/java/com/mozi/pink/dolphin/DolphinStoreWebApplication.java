package com.mozi.pink.dolphin;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * 启动器
 *
 * @author liuyimai
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource(locations = {"classpath:/spring/spring-*.xml"})
@MapperScan("com.mozi.pink.dolphin.mapper")
public class DolphinStoreWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(DolphinStoreWebApplication.class, args);
    }



}
