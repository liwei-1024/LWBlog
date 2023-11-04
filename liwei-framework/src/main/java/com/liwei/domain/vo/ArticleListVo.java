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

    private String title;

    private Long categoryName;

    private String thumbnail;

    private Long viewCount;

    private Date createTime;
}