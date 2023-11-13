package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.AddTagDto;
import com.liwei.domain.dto.EditTagDto;
import com.liwei.domain.dto.TagListDto;
import com.liwei.domain.vo.TagVo;
import com.liwei.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/{id}")
    public ResponseResult deleteTagById(@PathVariable Long id){
        return tagService.deleteTagById(id);
    }

    //根据标签的id来查询标签
    @GetMapping("/{id}")
    public ResponseResult getInfo(@PathVariable Long id){
        return tagService.getInfo(id);
    }

    //根据标签的id来修改标签
    @PutMapping
    public ResponseResult edit(@RequestBody EditTagDto tagDto){
        return tagService.edit(tagDto);
    }

    //写博文-查询文章标签接口
    @GetMapping("/listAllTag")
    public ResponseResult listAllTag(){
        List<TagVo> list = tagService.listAllTag();
        return ResponseResult.okResult(list);
    }
}