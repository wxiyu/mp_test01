package com.mybatisplustest.mp_test01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisplustest.mapper")//扫描mapper文件夹
public class MpTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(MpTest01Application.class, args);
    }

}
