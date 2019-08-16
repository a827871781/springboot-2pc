package com.example.springboot2pc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot2pc.dao.**.*")
public class Springboot2pcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2pcApplication.class, args);
    }

}
