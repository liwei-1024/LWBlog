package com.liwei.domain.vo;

import com.liwei.domain.entity.Role;
import com.liwei.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/14
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoAndRoleIdsVo {
    private User user;
    private List<Role> roles;
    private List<Long> roleIds;
}