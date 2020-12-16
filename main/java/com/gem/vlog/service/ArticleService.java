package com.gem.vlog.service;

import com.gem.vlog.model.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author admin
 * @Date 2020/12/15
 **/
public interface ArticleService {
    /**
     * 批量新增文章
     *
     * @param articles 文章集合
     */
    void insertArticles(List<Article> articles);


    /**
     * 根据用户id查询数据并分页
     *
     * @param PageNum 页码
     * @param pageSize 每页数量
     * @param userID 用户id
     * @return 返回结果
     */
    PageInfo<Article> selectByPage(int PageNum, int pageSize, int userId);
}
