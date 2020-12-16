package com.gem.vlog.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ArticleTag
 * @Description TODO
 * @Author admin
 * @Date 2020/12/15
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ArticleTag {
    private Integer id;
    private String articleId;
    private String tagName;
}
