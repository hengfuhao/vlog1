package com.gem.vlog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author admin
 * @Date 2020/12/3
 **/
@RestController
@RequestMapping(value = "api")
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello spring boot";
    }

}
