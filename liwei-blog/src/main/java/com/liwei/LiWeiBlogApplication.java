package com.liwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.liwei.mapper")
@EnableScheduling//@EnableScheduling是spring提供的定时任务的注解
@EnableSwagger2
public class LiWeiBlogApplication {
    public static void main(String[] args){
        SpringApplication.run(LiWeiBlogApplication.class,args);
    }
}
