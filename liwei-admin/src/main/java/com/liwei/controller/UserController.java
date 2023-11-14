package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.User;
import com.liwei.enums.AppHttpCodeEnum;
import com.liwei.exception.SystemException;
import com.liwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseResult add(@RequestBody User user) {
        if(!StringUtils.hasText(user.getUserName())){
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        if (!userService.checkUserNameUnique(user.getUserName())){
            throw new SystemException(AppHttpCodeEnum.USERNAME_EXIST);
        }
        if (!userService.checkPhoneUnique(user)){
            throw new SystemException(AppHttpCodeEnum.PHONENUMBER_EXIST);
        }
        if (!userService.checkEmailUnique(user)){
            throw new SystemException(AppHttpCodeEnum.EMAIL_EXIST);
        }
        return userService.addUser(user);
    }

}