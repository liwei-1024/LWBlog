package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Role;
import com.liwei.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:角色列表访问接口
* @Date:2023/11/14
*/
@RestController
@RequestMapping("system/role")
public class RoleController{

    @Autowired
    private RoleService roleService;

    @GetMapping("/list")
    public ResponseResult list(Role role,Integer pageNum,Integer pageSize){
        return roleService.selectRolePage(role,pageNum,pageSize);
    }
}