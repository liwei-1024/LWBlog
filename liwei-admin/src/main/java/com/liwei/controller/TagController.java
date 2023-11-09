package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/9
*/
@RestController
@RequestMapping("/content/tag")
public class TagController{

    @Autowired
    private TagService tagService;

    @GetMapping("/list")
    public ResponseResult list(){
        return ResponseResult.okResult(tagService.list());
    }
}