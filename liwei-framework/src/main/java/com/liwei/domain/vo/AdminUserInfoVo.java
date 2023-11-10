package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/9
*/
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserInfoVo{
    private List<String> permissions;

    private List<String> roles;

    private UserInfoVo user;
}