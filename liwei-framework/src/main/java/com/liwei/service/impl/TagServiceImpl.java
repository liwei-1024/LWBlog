package com.liwei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwei.domain.entity.Tag;
import com.liwei.service.TagService;
import com.liwei.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author 李 炜
* @description 针对表【lw_tag(标签)】的数据库操作Service实现
* @createDate 2023-11-09 16:48:10
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




