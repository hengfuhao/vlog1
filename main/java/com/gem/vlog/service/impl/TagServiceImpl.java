package com.gem.vlog.service.impl;

import com.gem.vlog.mapper.TagMapper;
import com.gem.vlog.model.entity.Tag;
import com.gem.vlog.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TagServiceImpl
 * @Description TODO
 * @Author admin
 * @Date 2020/12/14
 **/
@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagMapper tagMapper;

    @Override
    public List<Tag> selectAll() {
        return tagMapper.selectAll();
    }

}
