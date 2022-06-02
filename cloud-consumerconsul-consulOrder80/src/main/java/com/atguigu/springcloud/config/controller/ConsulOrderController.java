package com.atguigu.springcloud.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 马元博
 * @ClassName ConsulOrderController.java
 * @Description TODO
 * @createTime 2022年06月01日
 */
@Controller
public class ConsulOrderController
{

    private static final  String CONSUL_ORDER_URL="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(CONSUL_ORDER_URL+"/payment/consul", String.class);
        System.out.println("消费者调用支付服务(consule)--->result:" + result);
        return result;
    }

}
