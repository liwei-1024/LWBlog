package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Link;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.domain.vo.PageVo;

/**
* @author 李 炜
* @description 针对表【lw_link(友链)】的数据库操作Service
* @createDate 2023-11-05 11:09:06
*/
public interface LinkService extends IService<Link> {
    //查询友链
    ResponseResult getAllLink();
    //分页查询友链
    PageVo selectLinkPage(Link link, Integer pageNum, Integer pageSize);
}
