package com.liuliu.springboot.swagger2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.liuliu.springboot.swagger2.mapper")
@SpringBootApplication
@EnableSwagger2
public class SpringbootSwagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwagger2Application.class, args);
    }

}
