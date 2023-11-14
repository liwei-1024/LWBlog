package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Link;
import com.liwei.domain.vo.PageVo;
import com.liwei.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:友链的访问接口
* @Date:2023/11/14
*/
@RestController
@RequestMapping("/content/link")
public class LinkController{
    @Autowired
    private LinkService linkService;

    @GetMapping("/list")
    public ResponseResult list(Link link, Integer pageNum, Integer pageSize) {
        PageVo pageVo = linkService.selectLinkPage(link,pageNum,pageSize);
        return ResponseResult.okResult(pageVo);
    }
}