package com.liwei.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/11
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditTagDto{
    private Long id;
    //备注
    private String remark;
    //标签名
    private String name;
}