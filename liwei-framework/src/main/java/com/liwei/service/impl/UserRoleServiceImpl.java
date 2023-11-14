package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.entity.UserRole;
import com.liwei.service.UserRoleService;
import com.liwei.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 李 炜
* @description 针对表【sys_user_role(用户和角色关联表)】的数据库操作Service实现
* @createDate 2023-11-14 11:17:22
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




