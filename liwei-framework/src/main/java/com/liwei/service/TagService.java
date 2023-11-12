package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.AddTagDto;
import com.liwei.domain.dto.EditTagDto;
import com.liwei.domain.dto.TagListDto;
import com.liwei.domain.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liwei.domain.vo.TagVo;

import java.util.List;

/**
* @author 李 炜
* @description 针对表【lw_tag(标签)】的数据库操作Service
* @createDate 2023-11-09 16:48:10
*/
public interface TagService extends IService<Tag> {
    //查询标签列表
    ResponseResult pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);
    //新增标签
    ResponseResult addTag(AddTagDto addTagDto);
    //删除标签
    ResponseResult deleteTagById(Long id);
    //修改标签-①根据标签的id来查询标签
    ResponseResult getInfo(Long id);
    //修改标签-②根据标签的id来修改标签
    ResponseResult edit(EditTagDto tagDto);
    //写博文-查询文章标签的接口
    List<TagVo> listAllTag();
}
