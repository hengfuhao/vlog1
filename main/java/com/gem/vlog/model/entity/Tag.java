package com.gem.vlog.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Tag
 * @Description TODO
 * @Author admin
 * @Date 2020/12/14
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tag {
    private Integer id;
    private String tagName;
    private String tagColor;

}
