package com.liwei.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/11
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTagDto{
    //标签名
    private String name;
    //备注
    private String remark;
    //创建人
    private Long createBy;
    //创建时间
    private Date createTime;
    //更新人
    private Long updateBy;
    //更新时间
    private Date updateTime;
}