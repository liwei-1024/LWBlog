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

    List<String> selectPermsByUserId(Long userId);
}




