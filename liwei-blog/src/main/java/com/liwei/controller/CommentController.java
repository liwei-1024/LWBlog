package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Comment;
import com.liwei.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseResult addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }
}