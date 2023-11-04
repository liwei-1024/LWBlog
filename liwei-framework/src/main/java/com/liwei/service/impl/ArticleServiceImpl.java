package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.Article;
import com.liwei.service.ArticleService;
import com.liwei.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author 李 炜
* @description 针对表【lw_article(文章表)】的数据库操作Service实现
* @createDate 2023-11-03 23:51:06
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




