package com.liwei.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/8
*/
@Component
public class TestRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序初始化");
    }
}