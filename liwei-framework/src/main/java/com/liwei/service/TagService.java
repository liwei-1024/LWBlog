package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.AddTagDto;
import com.liwei.domain.dto.TagListDto;
import com.liwei.domain.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 李 炜
* @description 针对表【lw_tag(标签)】的数据库操作Service
* @createDate 2023-11-09 16:48:10
*/
public interface TagService extends IService<Tag> {

    ResponseResult pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);


    ResponseResult addTag(AddTagDto addTagDto);

    ResponseResult deleteTagById(Long id);
}
