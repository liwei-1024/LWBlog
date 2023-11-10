package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.entity.Role;
import com.liwei.service.RoleService;
import com.liwei.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 李 炜
* @description 针对表【sys_role(角色信息表)】的数据库操作Service实现
* @createDate 2023-11-09 23:02:29
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

    @Override
    public List<String> selectRoleKeyByUserId(Long id) {
        //判断是否是管理员 如果是返回集合中只需要有admin
        if(id == 1L){
            List<String> roleKeys = new ArrayList<>();
            roleKeys.add("admin");
            return roleKeys;
        }
        //否则查询用户所有的角色信息
        return getBaseMapper().selectRoleKeyByUserId(id);
    }
}




