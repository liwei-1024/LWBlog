package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.User;
import com.liwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description: 用户列表访问接口
* @Date:2023/11/14
*/
@RestController
@RequestMapping("/system/user")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseResult list(User user, Integer pageNum, Integer pageSize) {
        return userService.selectUserPage(user,pageNum,pageSize);
    }

}