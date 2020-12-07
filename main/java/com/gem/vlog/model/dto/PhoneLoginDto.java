package com.gem.vlog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PhoneLoginDto
 * @Description TODO
 * @Author admin
 * @Date 2020/12/6
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneLoginDto {
    private String phone;
    private  String code;
}
