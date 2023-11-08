package com.liwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.liwei.mapper")
@EnableScheduling
public class LiWeiBlogApplication {
    public static void main(String[] args){
        SpringApplication.run(LiWeiBlogApplication.class,args);
    }
}
