package com.qfedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
@MapperScan("com.qfedu.mapper")//扫描Mybatis对应的包  基于注解
public class FeriSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeriSpringbootMybatisApplication.class, args);
    }
}
