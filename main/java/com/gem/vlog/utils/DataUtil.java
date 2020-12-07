package com.gem.vlog.utils;

import com.gem.vlog.model.Card;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName DataUtil
 * @Description TODO
 * @Author admin
 * @Date 2020/12/3
 **/
public class DataUtil {
        public static List<Card> initCards() {
            Card[] cards = new Card[]{
                    Card.builder()
                            .id(1)
                            .title("Java学习")
                            .bgImg("https://hfh.oss-cn-beijing.aliyuncs.com/student/1.jpg")
                            .content("Java学习")
                            .build(),
                    Card.builder()
                            .id(1)
                            .title("Java Script学习")
                            .bgImg("https://hfh.oss-cn-beijing.aliyuncs.com/student/2.jpg")
                            .content("Java Script学习")
                            .build(),
                    Card.builder()
                            .id(1)
                            .title("Linux学习")
                            .bgImg("https://hfh.oss-cn-beijing.aliyuncs.com/student/3.jpg")
                            .content("Linux学习")
                            .build(),
                    Card.builder()
                            .id(1)
                            .title("MySQL学习")
                            .bgImg("https://hfh.oss-cn-beijing.aliyuncs.com/student/4.jpg")
                            .content("MySQL学习")
                            .build(),
                    Card.builder()
                            .id(1)
                            .title("Python学习")
                            .bgImg("https://hfh.oss-cn-beijing.aliyuncs.com/student/5.jpg")
                            .content("Python学习")
                            .build()
            };
            return Arrays.asList(cards);
        }
    }

