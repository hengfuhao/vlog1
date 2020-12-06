package com.gem.vlog;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gem.vlog.mapper")
public class VlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(VlogApplication.class, args);
    }

}
