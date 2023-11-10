package com.liwei.mapper;

import com.liwei.domain.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【sys_role(角色信息表)】的数据库操作Mapper
* @createDate 2023-11-09 23:02:29
* @Entity com.liwei.domain.entity.Role
*/
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long id);
}




