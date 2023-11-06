package com.liwei.service;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 李 炜
* @description 针对表【lw_comment(评论表)】的数据库操作Service
* @createDate 2023-11-06 11:33:27
*/
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize);
}
