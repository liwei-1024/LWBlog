package com.liwei.controller;

import com.liwei.annotaion.SystemLog;
import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.User;
import com.liwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/7
*/
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping("/userInfo")
    public ResponseResult userInfo(){
        return userService.userInfo();
    }

    @PutMapping("/userInfo")
    @SystemLog(businessName = "更新用户信息")
    public ResponseResult updateUserInfo(@RequestBody User user){
        return userService.updateUserInfo(user);
    }

    @PostMapping("/register")
    public ResponseResult register(@RequestBody User user){
        return userService.register(user);
    }
}