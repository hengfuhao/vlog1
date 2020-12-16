package com.gem.vlog.mapper;

import com.gem.vlog.VlogApiApplication;
import com.gem.vlog.model.entity.ArticleTag;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest(classes = VlogApiApplication.class)
@Slf4j
public class ArticleTagMapperTest {
    @Resource
    private ArticleTagMapper articleTagMapper;

    @Test
    public void insertArticleTags() {
        List<ArticleTag> articleTagList = new ArrayList<>();
        articleTagList.add(ArticleTag.builder().articleId("1").tagName("leecode").build());
        articleTagList.add(ArticleTag.builder().articleId("2").tagName("NLP").build());
        articleTagMapper.insertArticleTags(articleTagList);
    }

    @Test
    public void selectByArticleId() {
    }
}