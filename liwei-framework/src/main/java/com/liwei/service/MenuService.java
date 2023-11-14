package com.liwei.service;

import com.liwei.domain.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【sys_menu(菜单权限表)】的数据库操作Service
* @createDate 2023-11-09 21:40:17
*/
public interface MenuService extends IService<Menu> {

    //查询用户的权限信息
    List<String> selectPermsByUserId(Long id);
    //查询用户的路由信息，也就是查询权限菜单
    List<Menu> selectRouterMenuTreeByUserId(Long userId);
    //查询菜单列表
    List<Menu> selectMenuList(Menu menu);
    //删除菜单-判断是否存在子菜单
    boolean hasChild(Long menuId);
    //修改角色-根据角色id查询对应角色菜单列表树
    List<Long> selectMenuListByRoleId(Long roleId);


}
