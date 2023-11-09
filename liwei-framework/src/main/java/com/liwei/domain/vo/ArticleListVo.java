package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/4
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleListVo{

    private Long id;
    //标题
    private String title;
    //文章摘要
    private String summary;
    //所属分类名
    private String categoryName;
    //缩略图
    private String thumbnail;
    //访问量
    private Long viewCount;

    private Date createTime;
}