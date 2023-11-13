package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.AddArticleDto;
import com.liwei.domain.dto.ArticleDto;
import com.liwei.domain.entity.Article;
import com.liwei.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
//    @PreAuthorize("@ps.hasPermission('content:article:writer')")//权限控制
    public ResponseResult add(@RequestBody AddArticleDto article){
        return articleService.add(article);
    }

    @GetMapping("/list")
    public ResponseResult list(Article article,Integer pageNum, Integer pageSize){
        return articleService.selectArticlePage(article,pageNum,pageSize);
    }

    @GetMapping("/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id")Long id){
        return articleService.getInfo(id);
    }

    @PutMapping
    public ResponseResult edit(@RequestBody ArticleDto articleDto){
        return articleService.edit(articleDto);
    }
}