package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/5
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkVo{

    private Long id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String logo;

    /**
     *
     */
    private String description;

    /**
     * 网站地址
     */
    private String address;


}