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

    List<String> selectPermsByUserId(Long id);

    List<Menu> selectRouterMenuTreeByUserId(Long userId);

    List<Menu> selectMenuList(Menu menu);

    boolean hasChild(Long menuId);
}
