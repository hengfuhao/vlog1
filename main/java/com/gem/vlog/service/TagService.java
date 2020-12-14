package com.gem.vlog.service;

import com.gem.vlog.model.entity.Tag;

import java.util.List;

/**
 * @ClassName TagService
 * @Description TODO
 * @Author admin
 * @Date 2020/12/14
 **/
public interface TagService {
    /**
     * 查看所有标签
     * @return 所有标签
     */
    List<Tag> selectAll();
}
