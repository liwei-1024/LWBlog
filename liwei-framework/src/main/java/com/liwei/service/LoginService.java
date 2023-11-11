package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.User;

public interface LoginService {

    ResponseResult login(User user);

    ResponseResult logout();
}