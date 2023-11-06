package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.entity.User;
import com.liwei.mapper.UserMapper;
import com.liwei.service.UserService;
import org.springframework.stereotype.Service;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/6
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}