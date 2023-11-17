package com.liwei.mapper;

import com.liwei.domain.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 李 炜
* @description 针对表【lw_article(文章表)】的数据库操作Mapper
* @createDate 2023-11-03 23:51:06
* @Entity com.liwei.domain.entity.Article
*/
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}




