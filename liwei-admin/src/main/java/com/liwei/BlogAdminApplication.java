package com.liwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* @Auther:又菜又爱玩的炜
* @Description:博客后台启动类
* @Date:2023/11/9
*/
@SpringBootApplication
@MapperScan("com.liwei.mapper")
public class BlogAdminApplication{
    public static void main(String[] args){
        SpringApplication.run(BlogAdminApplication.class,args);
    }
}