package com.gem.vlog.mapper;

import com.gem.vlog.VlogApiApplication;
import com.gem.vlog.mapper.ArticleMapper;
import com.github.pagehelper.Page;
import com.mysql.cj.util.TimeUtil;
import com.gem.vlog.VlogApiApplication;
import com.gem.vlog.model.entity.Article;
import com.gem.vlog.task.ArticleTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = VlogApiApplication.class)
@Slf4j
class ArticleMapperTest {

    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleTask articleTask;

    @Test
    void insertArticle() throws Exception {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(4, 8, 5, TimeUnit.SECONDS ,new SynchronousQueue<>());
        Future<List<Article>> future = executor.submit(articleTask);
        List<Article> articles = future.get();
        int count = articleMapper.insertArticles(articles);
        System.out.println(count);
    }

    @Test
    void selectAll() {
        Page<Article> articlePage = articleMapper.selectAll(1);
        System.out.println(articlePage.toPageInfo().getList().size());

    }
}