package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 马元博
 * @ClassName PaymentDao.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
@Mapper
public interface PaymentDao
{
    public Integer create(Payment payment);

    public Payment selectPaymentById(@Param("id") Long id);
}
