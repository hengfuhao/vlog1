package com.gem.vlog.service;

import com.gem.vlog.VlogApiApplication;
import com.gem.vlog.model.entity.Article;
import com.gem.vlog.task.ArticleTask;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.concurrent.*;

import static org.junit.Assert.*;

@SpringBootTest(classes = VlogApiApplication.class)
@Slf4j
public class ArticleServiceTest {
    @Resource
    private ArticleService articleService;
    @Resource
    private ArticleTask articleTask;

    @Test
    public void insertArticles() {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(4,8,5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Future<List<Article>> future = executor.submit(articleTask);
        List<Article> articles=null;
        try {
            articles = future.get();
        } catch (InterruptedException | ExecutionException e) {

            e.printStackTrace();
        }
        articleService.insertArticles(articles);
    }

    @Test
    public void selectAllByPage() {
        PageInfo<Article> articlePageInfo = articleService.selectByPage(1, 9, 1);
        System.out.println(articlePageInfo.getList().size());

    }
}