package com.liwei.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/5
*/
@Data
@Accessors(chain = true)
public class UserInfoVo{

    //主键
    private Long id;
    //昵称
    private String nickName;
    //头像
    private String avatar;

    private String sex;

    private String email;
}