package com.liwei.service;

import com.liwei.domain.entity.RoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 李 炜
* @description 针对表【sys_role_menu(角色和菜单关联表)】的数据库操作Service
* @createDate 2023-11-14 10:07:12
*/
public interface RoleMenuService extends IService<RoleMenu> {

    //修改角色-保存修改好的角色信息
    void deleteRoleMenuByRoleId(Long id);

}
