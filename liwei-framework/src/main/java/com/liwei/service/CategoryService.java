package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.domain.vo.CategoryVo;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【lw_category(分类表)】的数据库操作Service
* @createDate 2023-11-04 19:34:32
*/
public interface CategoryService extends IService<Category> {

    //查询文章分类接口
    ResponseResult getCategoryList();

    //写博客-查询文章分类接口
    List<CategoryVo> listAllCategory();


    ResponseResult selectCategoryPage(Category category, Integer pageNum, Integer pageSize);
}
