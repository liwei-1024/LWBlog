package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.AddArticleDto;
import com.liwei.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:新增博文接口
* @Date:2023/11/12
*/
@RestController
@RequestMapping("/content/article")
public class ArticleController{

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseResult add(@RequestBody AddArticleDto article){
        return articleService.add(article);
    }
}