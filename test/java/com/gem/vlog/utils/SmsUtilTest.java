package com.gem.vlog.utils;

import com.gem.vlog.VlogApiApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = VlogApiApplication.class)
@Slf4j
class SmsUtilTest {
@Resource
private  SmsUtil smsUtil;
    @Test
    void sendSms() {
        smsUtil.sendSms("18501549151","1314520");
    }
}