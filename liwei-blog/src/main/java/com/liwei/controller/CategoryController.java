package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:分类列表
* @Date:2023/11/4
*/
@RestController
@RequestMapping("/category")
public class CategoryController{

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategoryList")
    public ResponseResult getCategoryList(){
        return categoryService.getCategoryList();
    }
}