package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/5
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogUserLoginVo{

    private String token;

    private UserInfoVo userInfoVo;
}