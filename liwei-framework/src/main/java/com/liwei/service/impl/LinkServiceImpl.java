package com.liwei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.constants.SystemConstants;
import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Link;
import com.liwei.domain.vo.LinkVo;
import com.liwei.service.LinkService;
import com.liwei.mapper.LinkMapper;
import com.liwei.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【lw_link(友链)】的数据库操作Service实现
* @createDate 2023-11-05 11:09:06
*/
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link>
    implements LinkService{

    @Override
    public ResponseResult getAllLink() {
        //查询所有审核通过的
        LambdaQueryWrapper<Link> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Link::getStatus, SystemConstants.LINK_STATUS_NORMAL);
        List<Link> links = list(queryWrapper);
        //转换成vo
        List<LinkVo> linkVos = BeanCopyUtils.copyBeanList(links, LinkVo.class);
        return ResponseResult.okResult(linkVos);
    }
}




