package com.liwei.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/14
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeRoleStatusDto{

    private Long roleId;

    private String status;
}