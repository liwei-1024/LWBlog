package com.liwei.constants;

/*
* @Auther:又菜又爱玩的炜
* @Description:字面量处理
* @Date:2023/11/4
*/
public class SystemConstants{

    /*
    * 文章是草稿
    *
    * */
    public static final int ARTICLE_STATUS_DRAFT= 1;

    /*
    * 文章是正常发布状态
    * */
    public static final int ARTICLE_STATUS_NORMAL= 0;

    /*
    *分类表的分类状态是正常状态
    * */
    public static final String STATUS_NORMAL = "0";
    /*
    * 友链状态为审核通过
    * */
    public static final String LINK_STATUS_NORMAL = "0";
    /**
     * 评论类型为：文章评论
     */
    public static final String ARTICLE_COMMENT = "0";
    /**
     * 评论类型为：友链评论
     */
    public static final String LINK_COMMENT = "1";

    /**
     * 权限类型，菜单
     */
    public static final String MENU = "C";

    /**
     * 权限类型，按钮
     */
    public static final String BUTTON = "F";

    /**
     * 正常状态
     */
    public static final String NORMAL = "0";
    /**
     * 判断为管理员用户
     */
    public static final String ADMIN = "1";
    public static final long ARTICLE_STATUS_CURRENT = 1;
    public static final long ARTICLE_STATUS_SIZE = 10;
    public static final String ARTICLE_VIEWCOUNT = "article:viewCount";
}