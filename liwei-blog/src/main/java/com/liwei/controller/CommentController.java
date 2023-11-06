package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @Auther:又菜又爱玩的炜
* @Description:评论接口实现
* @Date:2023/11/6
*/
@RestController
@RequestMapping("/comment")
public class CommentController{

    @Autowired
    private CommentService commentService;

    @GetMapping("/commentList")
    public ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize){
        return commentService.commentList(articleId,pageNum,pageSize);
    }
}