package com.liwei.controller;

import com.liwei.domain.Article;
import com.liwei.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:测试接口类
* @Date:2023/11/4
*/
@RestController
@RequestMapping("/article")
public class ArticleController{

    @Autowired
    private ArticleService articleService;

    @GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }
}