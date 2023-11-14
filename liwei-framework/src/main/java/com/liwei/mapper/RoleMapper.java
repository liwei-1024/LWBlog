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
    //查询普通用户的角色权限
    List<String> selectRoleKeyByUserId(Long id);
    //修改用户-①根据id查询用户信息
    List<Long> selectRoleIdByUserId(Long userId);
}




