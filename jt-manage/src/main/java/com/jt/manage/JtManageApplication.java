package com.jt.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"com"})
@MapperScan("com.jt.manage.mapper")
public class JtManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtManageApplication.class, args);
    }

}
