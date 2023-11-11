package com.liwei.mapper;

import com.liwei.domain.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 李 炜
* @description 针对表【lw_tag(标签)】的数据库操作Mapper
* @createDate 2023-11-09 16:48:10
* @Entity com.liwei.domain.entity.Tag
*/
public interface TagMapper extends BaseMapper<Tag> {
    int myUpdateById(@Param("id") Long id,@Param("flag") int flag);
}




