package com.liwei.mapper;

import com.liwei.domain.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【sys_menu(菜单权限表)】的数据库操作Mapper
* @createDate 2023-11-09 21:40:17
* @Entity com.liwei.domain.entity.Menu
*/
public interface MenuMapper extends BaseMapper<Menu> {
    //查询普通用户的权限信息
    List<String> selectPermsByUserId(Long userId);
    //查询超级管理员的路由信息(权限菜单)
    List<Menu> selectAllRouterMenu();
    //查询普通用户的路由信息(权限菜单)
    List<Menu> selectRouterMenuTreeByUserId(Long userId);
    //修改角色-根据角色id查询对应角色菜单列表树
    List<Long> selectMenuListByRoleId(Long roleId);
}




