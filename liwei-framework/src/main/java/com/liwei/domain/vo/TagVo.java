package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/12
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagVo{
    private Long id;
    private String name;
    private String remark;
}