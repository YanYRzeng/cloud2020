package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 马元博
 * @ClassName PaymentService.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
public interface PaymentService
{
    public Integer create(Payment payment);

    public Payment selectPaymentById(Long id);
}
