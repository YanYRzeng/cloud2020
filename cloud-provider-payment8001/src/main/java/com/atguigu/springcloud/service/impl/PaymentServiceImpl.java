package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 马元博
 * @ClassName PaymentServiceImpl.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public Integer create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment selectPaymentById(Long id)
    {
        return paymentDao.selectPaymentById(id);
    }
}
