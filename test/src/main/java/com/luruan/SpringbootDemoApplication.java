package com.luruan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author ZG
 */
@SpringBootApplication
@MapperScan("com.luruan.mapper")
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        //创建Spring容器  参数一：启动类class字节码  参数二：main方法参数
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}