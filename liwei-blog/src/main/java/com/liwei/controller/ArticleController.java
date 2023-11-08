package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

 /*   @GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }*/

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){
        //查询热门文章    封装成ResponseResult返回
        ResponseResult result = articleService.hotArticleList();
        return result;
    }

    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }

    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }

    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);
    }
}