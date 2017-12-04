package com.kevinfuture.sort.algorithm.insert.direct;

import com.kevinfuture.sort.algorithm.annotation.Description;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 * 直接插入排序
 * @author kevinfuture
 * @date 2017/12/4
 */
@Description("时间复杂度O(n^2)，稳定")
public interface IInsertDirect {
    /**
     * 直接排序接口方法
     * @param doubles
     * @param orderEnum
     * @return list
     * @throws Throwable
     ***/
    List sort(double[] doubles, OrderEnum orderEnum) throws Throwable;
}
