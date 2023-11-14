package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.ChangeRoleStatusDto;
import com.liwei.domain.entity.Role;
import com.liwei.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/changeStatus")
    public ResponseResult changeStatus(@RequestBody ChangeRoleStatusDto roleStatusDto){
        Role role = new Role();
        role.setId(roleStatusDto.getRoleId());
        role.setStatus(roleStatusDto.getStatus());
        return ResponseResult.okResult(roleService.updateById(role));
    }

    @PostMapping
    public ResponseResult add(@RequestBody Role role){
        roleService.insertRole(role);
        return ResponseResult.okResult();
    }

    @GetMapping(value = "/{roleId}")
    public ResponseResult getInfo(@PathVariable Long roleId) {
        Role role = roleService.getById(roleId);
        return ResponseResult.okResult(role);
    }

    @PutMapping
    public ResponseResult edit(@RequestBody Role role) {
        roleService.updateRole(role);
        return ResponseResult.okResult();
    }

    @DeleteMapping("/{id}")
    public ResponseResult remove(@PathVariable(name = "id") Long id) {
        roleService.removeById(id);
        return ResponseResult.okResult();
    }
}