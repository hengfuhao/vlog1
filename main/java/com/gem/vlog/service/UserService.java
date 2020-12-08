package com.gem.vlog.service;

import com.gem.vlog.model.dto.LoginDto;
import com.gem.vlog.model.dto.PhoneLoginDto;
import com.gem.vlog.model.dto.WxLoginDto;
import com.gem.vlog.model.entity.User;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author admin
 * @Date 2020/12/5
 **/
public interface UserService {

    /**
     * 登录
     *
     * @param loginDto 登录dto 对象
     * @return boolean
     */
    boolean login(LoginDto loginDto);

    /***
     *
     * @param phone 手机号
     * @return User
     */
    User getUser(String phone);

    /**
     *
     * @param phoneLoginDto 入参
     * @return boolean
     */
    boolean phoneLogin(PhoneLoginDto phoneLoginDto);

    /**
     *
     * @param user 用户
     * @return 修改的用户
     */
    User updateUser(User user);

    /**
     *
     * @param file 文件对象
     * @return 上传后的url
     */
    String uploadFile(MultipartFile file);

    /**
     *
     * @param wxLoginDto 入参
     * @return boolean
     */
    User wxLogin(WxLoginDto wxLoginDto);

}