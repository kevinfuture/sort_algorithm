package com.kevinfuture.sort.algorithm.enums.impl;

import com.kevinfuture.sort.algorithm.annotation.Description;
import com.kevinfuture.sort.algorithm.enums.IEnum;

/**
 * 枚举实现
 * @author kevinfuture
 * @date 2017/11/28
 */
public enum OrderEnum implements IEnum {
    @Description("升序")
    asc,
    @Description("降序")
    des;

    @Override
    public String order() {
        return null;
    }
}
