package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Category;
import com.liwei.domain.vo.CategoryVo;
import com.liwei.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:写博客
* @Date:2023/11/11
*/
@RestController
@RequestMapping("/content/category")
public class CategoryController{

    @Autowired
    private CategoryService categoryService;
    //写博文-查询文章分类的接口
    @GetMapping("/listAllCategory")
    public ResponseResult listAllCategory(){
        List<CategoryVo> list = categoryService.listAllCategory();
        return ResponseResult.okResult(list);
    }

    @GetMapping("/list")
    public ResponseResult list(Category category,Integer pageNum, Integer pageSize){
        return categoryService.selectCategoryPage(category,pageNum,pageSize);
    }
}