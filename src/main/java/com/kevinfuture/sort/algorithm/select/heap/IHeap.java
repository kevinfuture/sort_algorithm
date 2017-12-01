package com.kevinfuture.sort.algorithm.select.heap;

import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 * 堆排序
 *
 * @author kevinfuture
 * @date 2017/11/30
 */
public interface IHeap {
    /**
     * 堆排序接口方法
     * @param doubles
     * @param orderEnum
     * @return list
     * @throws Throwable
     ***/
    List sort(double[] doubles, OrderEnum orderEnum) throws Throwable;
}
