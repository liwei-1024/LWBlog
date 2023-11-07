package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.User;
import com.liwei.domain.vo.UserInfoVo;
import com.liwei.mapper.UserMapper;
import com.liwei.service.UserService;
import com.liwei.utils.BeanCopyUtils;
import com.liwei.utils.SecurityUtils;
import org.springframework.stereotype.Service;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/6
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public ResponseResult userInfo() {
        //获取当前用户id
        Long userId = SecurityUtils.getUserId();
        //根据用户id查询用户信息
        User user = getById(userId);
        //封装成UserInfoVo
        UserInfoVo vo = BeanCopyUtils.copyBean(user,UserInfoVo.class);
        return ResponseResult.okResult(vo);
    }
}