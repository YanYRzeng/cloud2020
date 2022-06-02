package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 马元博
 * @ClassName Payment.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
