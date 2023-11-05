package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:友链
* @Date:2023/11/5
*/
@RestController
@RequestMapping("/link")
public class LinkController{

    @Autowired
    private LinkService linkService;

    @GetMapping("/getAllLink")
    public ResponseResult getAllLink(){
        return linkService.getAllLink();
    }
}