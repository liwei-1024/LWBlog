package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【sys_role(角色信息表)】的数据库操作Service
* @createDate 2023-11-09 23:02:29
*/
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);

    ResponseResult selectRolePage(Role role, Integer pageNum, Integer pageSize);
}
