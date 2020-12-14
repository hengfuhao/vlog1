package com.gem.vlog.mapper;

import com.gem.vlog.VlogApiApplication;
import com.gem.vlog.common.Gender;
import com.gem.vlog.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest(classes = VlogApiApplication.class)
@Slf4j
class UserMapperTest {
    //注入UserMapper的实例
    @Resource
    private UserMapper userMapper;

    @Test
    void insert() throws Exception {
        User user = User.builder()
                .phone("18501549151")
                .password("123456789")
                .nickname("张三")
                .avatar("2.jpg")
                .gender(Gender.male.type)
                .birthday(LocalDate.now())
                .address("江苏苏州")
                .createTime(LocalDateTime.now())
                .build();
        userMapper.insert(user);
    }

    @Test
    void findUserByPhone() throws SQLException {
        User user = userMapper.findUserByPhone("18501549151");
        log.info(String.valueOf(user));
    }

    @Test
    void updateUser() throws Exception {
        User user = userMapper.findUserByPhone("18501549151");
        user.setPassword(DigestUtils.md5Hex("123789"));
        user.setNickname("衡厉害");
        user.setAvatar("https://hfh.oss-cn-beijing.aliyuncs.com/1.jpg");
        user.setGender(Gender.male.type);
        user.setBirthday(LocalDate.of(2000, 6, 9));
        user.setAddress("江苏省昆山市花桥镇");
        userMapper.updateUser(user);
    }
}