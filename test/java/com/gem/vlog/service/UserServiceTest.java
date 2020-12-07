package com.gem.vlog.service;


import com.gem.vlog.VlogApplication;
import com.gem.vlog.common.Gender;
import com.gem.vlog.model.dto.LoginDto;
import com.gem.vlog.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = VlogApplication.class)
@Slf4j
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void login() {
        LoginDto loginDto = LoginDto.builder()
                .phone("18501549151")
                .password("123456")
                .build();
        boolean flag = userService.login(loginDto);
        assertTrue(flag);
    }

    @Test
    void getUser() {
        User user = userService.getUser("18501549151");
        log.info(String.valueOf(user));
    }
    @Test
    void updateUser(){
        User user = User.builder()
                .phone("18501549151")
                .password(DigestUtils.md5Hex("123789"))
                .nickname("jy")
                .avatar("https://hfh.oss-cn-beijing.aliyuncs.com/1.jpg")
                .gender(Gender.secret.type)
                .birthday(LocalDate.of(2000,6,9))
                .address("德州扑克")
                .build();
        userService.updateUser(user);
    }
}