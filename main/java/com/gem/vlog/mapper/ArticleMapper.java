package com.gem.vlog.mapper;

import com.gem.vlog.model.entity.Article;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName ArticleMapper
 * @Description TODO
 * @Author admin
 * @Date 2020/12/15
 **/
public interface ArticleMapper {
    /**
     * 批量插入文章
     *
     * @param articleList 文章集合
     * @return int
     */
    @Insert({
            "<script>",
            "INSERT INTO t_article (id,category,user_id,title,cover,summary,content,url,publish_date,total_words,duration,page_view) VALUES ",
            "<foreach collection='articleList' item='item' index='index' separator=','>",
            "(#{item.id},#{item.category},#{item.userId},#{item.title},#{item.cover},#{item.summary},#{item.content},"+
            "#{item.url},#{item.publishDate},#{item.totalWords},#{item.duration},#{item.pageView})",
            "</foreach>",
            "</script>"
    })
    int insertArticles(@Param(value = "articleList") List<Article> articleList);

    /**
     * 查询某个用户的6篇推荐文章
     *
     * @param userId 用户id
     * @return List<Article>
     */
    @Select("SELECT id,category,user_id,title,cover,summary from t_article where user_id=#{userId}  order by page_view desc limit 6")
    @Results({
            @Result(id=true,property = "id", column = "id"),
            @Result(property = "category", column = "category"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "title", column = "title"),
            @Result(property = "cover", column = "cover"),
            @Result(property = "summary", column = "summary")
    })
    List<Article> getRecommendArticles(@Param(value = "userId") int userId);
    /**
     *
     * @param userId 用户id
     * @return 文章集合
     */
    @Select("SELECT id,category,user_id,title,cover,summary,publish_date from t_article a where a.user_id=#{userId} ")
    @Results({
            @Result(id=true,property = "id", column = "id"),
            @Result(property = "category", column = "category"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "title", column = "title"),
            @Result(property = "cover", column = "cover"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "publishDate", column = "publish_date"),
            @Result(property = "tagList", column = "id",
             many= @Many(select = "com.gem.vlog.mapper.ArticleTagMapper.selectByArticleId"))
    })
    Page<Article> selectAll(@Param(value = "userId") int userId);

    /**
     * 根据文章id找文章详情
     *
     * @param id 文章id
     * @return Article详情
     */
    @Select("SELECT * FROM t_article where id = #{id} ")
    @Results({
            @Result(id=true,property = "id", column = "id"),
            @Result(property = "category", column = "category"),
            @Result(property = "userId", column = "userId"),
            @Result(property = "title", column = "title"),
            @Result(property = "cover", column = "cover"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "publishDate", column = "publish_date"),
            @Result(property = "totalWords", column = "total_words"),
            @Result(property = "duration", column = "duration"),
            @Result(property = "pageView", column = "page_view"),
            @Result(property = "tagList", column = "id",
                    many= @Many(select = "com.gem.vlog.mapper.ArticleTagMapper.selectByArticleId"))
    })
   Article getDetail(@Param(value = "id") String id);
}
