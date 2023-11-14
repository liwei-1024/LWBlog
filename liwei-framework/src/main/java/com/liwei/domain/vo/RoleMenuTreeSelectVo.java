package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/14
*/
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenuTreeSelectVo{

    private List<Long> checkedKeys;

    private List<MenuTreeVo> menus;
}
