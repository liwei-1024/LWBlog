package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/4
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo{
    private Long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;
}