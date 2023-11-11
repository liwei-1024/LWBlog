package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.AddTagDto;
import com.liwei.domain.dto.TagListDto;
import com.liwei.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ResponseResult list(Integer pageNum, Integer pageSize, TagListDto tagListDto){
        return tagService.pageTagList(pageNum,pageSize,tagListDto);
    }

    @PostMapping
    public ResponseResult addTag(@RequestBody AddTagDto addTagDto){
        return tagService.addTag(addTagDto);
    }
}