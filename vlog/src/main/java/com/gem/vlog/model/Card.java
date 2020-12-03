package com.gem.vlog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Card
 * @Description TODO
 * @Author admin
 * @Date 2020/12/3
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Card {
    private Integer id;
    private String title;
    private String bgImg;
    private String content;
}
