package com.gem.vlog.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName AliyunResource 阿里云资源配置类
 * @Description 阿里云资源配置类
 * @Author  hfh
 * @Date 2020/12/6 13:34
 **/
@Component
@Data
@PropertySource("classpath:aliyun.properties")
@ConfigurationProperties(prefix = "aliyun")
public class AliyunResource {
    private String accessKeyId;
    private String accessKeySecret;

        }
