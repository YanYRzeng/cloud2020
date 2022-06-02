package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 马元博
 * @ClassName PaymentController.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
@RestController
@Slf4j
public class PaymentController
{
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        Integer integer = paymentService.create(payment);
        log.info("********插入返回结果 result: " + integer);
        if (integer > 0) return new CommonResult(200, "插入数据成功 服务端口号:" + serverPort, integer);
        return new CommonResult(444, "插入数据失败", null);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult selectPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.selectPaymentById(id);
        log.info("*******查询结果 result: " + payment);
        if (payment == null) return new CommonResult(444, "查询结果失败 服务端口号:" + serverPort, null);
        return new CommonResult(200, "查询结果成功 服务端口号:" + serverPort, payment);
    }

    @GetMapping("/payment/discover")
    public Object discover()
    {
        List<String> elements = discoveryClient.getServices();
        elements.forEach(element ->
        {
            log.info("******" + element);
        });
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(serviceInstance ->
        {
            log.info(serviceInstance.getInstanceId() + "\t" + serviceInstance.getHost() + "\t" + serviceInstance.getPort() + "\t" + serviceInstance.getUri());
        });
        return this.discoveryClient;
    }
}
