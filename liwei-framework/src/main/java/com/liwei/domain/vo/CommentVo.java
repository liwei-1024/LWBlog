package com.liwei.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/6
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentVo{

    private Long id;

    /**
     * 评论类型（0代表文章评论，1代表友链评论）
     */
//    private String type;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 根评论id
     */
    private Long rootId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 所回复的目标评论的userid
     */
    private Long toCommentUserId;

    private String toCommentUserName;

    /**
     * 回复目标评论id
     */
    private Long toCommentId;

    /**
     *
     */
    private Long createBy;

    /**
     *
     */
    private Date createTime;

    private String username;

    private List<CommentVo> children;
}