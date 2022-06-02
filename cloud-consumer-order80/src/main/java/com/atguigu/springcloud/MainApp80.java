package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 马元博
 * @ClassName MainApp80.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp80
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp80.class,args);
    }
}
