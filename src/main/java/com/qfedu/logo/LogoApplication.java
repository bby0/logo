package com.qfedu.logo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@EnableTransactionManagement
@SpringBootApplication
@MapperScan(value = "com.qfedu.logo.mapper")
//@ComponentScan(basePackages = "com.qfedu.logo.service")
public class LogoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogoApplication.class, args);
    }
}
