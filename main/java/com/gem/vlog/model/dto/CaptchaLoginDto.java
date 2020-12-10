package com.gem.vlog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CaptchaLoginDto
 * @Description TODO
 * @Author admin
 * @Date 2020/12/11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CaptchaLoginDto {
private  String phone;
private String password;
private  String captcha;
}

