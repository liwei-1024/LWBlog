package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.entity.ArticleTag;
import com.liwei.service.ArticleTagService;
import com.liwei.mapper.ArticleTagMapper;
import org.springframework.stereotype.Service;

/**
* @author 李 炜
* @description 针对表【lw_article_tag(文章标签关联表)】的数据库操作Service实现
* @createDate 2023-11-12 18:49:58
*/
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag>
    implements ArticleTagService{

}




