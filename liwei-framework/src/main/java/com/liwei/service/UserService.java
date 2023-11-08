package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 李 炜
* @description 针对表【sys_user(用户表)】的数据库操作Service
* @createDate 2023-11-06 12:37:41
*/
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}
