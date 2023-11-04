package com.liwei.service;

import com.liwei.domain.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.domain.ResponseResult;

/**
* @author 李 炜
* @description 针对表【lw_article(文章表)】的数据库操作Service
* @createDate 2023-11-03 23:51:06
*/
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);
}
