package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 马元博
 * @ClassName CommonResult.java
 * @Description TODO
 * @createTime 2022年05月30日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String message;
    private T data;
    public CommonResult (Integer code ,String message)
    {
        this(code,message,null);
    }
}
