package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 马元博
 * @ClassName ConsulPayment80.java
 * @Description TODO
 * @createTime 2022年06月01日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment80
{
    public static void main(String[] args)
    {
       SpringApplication.run(ConsulPayment80.class,args);
    }
}
