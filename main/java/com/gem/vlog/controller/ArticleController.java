package com.gem.vlog.controller;

import com.gem.vlog.common.ResponseResult;
import com.gem.vlog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName ArticleController
 * @Description TODO
 * @Author admin
 * @Date 2020/12/15
 **/
@RestController
@RequestMapping(value = "/api/article")
@Slf4j
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @PostMapping("page")
    public ResponseResult getArticlesByPage(@RequestParam (name = "pageNum",defaultValue = "1",required = false) int pageNum,
                                            @RequestParam (name = "pageSize",defaultValue = "9",required = false) int pageSize) {
        return ResponseResult.success(articleService.selectByPage(pageNum, pageSize, getUserId()));
    }
    @GetMapping("recommend")
    public ResponseResult getRecommend(){
        return ResponseResult.success(articleService.getRecommendArticles(getUserId()));
    }

    @GetMapping("{id}")
    public ResponseResult getArticleDetail(@PathVariable String id) {
        return ResponseResult.success(articleService.getDetail(id));
    }
    public int getUserId(){
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert sra != null;
        HttpServletRequest request = sra.getRequest();
        return Integer.parseInt(request.getHeader("userId"));
    }
}
