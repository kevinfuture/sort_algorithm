package com.kevinfuture.sort.algorithm.select.heap;

import com.kevinfuture.sort.algorithm.annotation.Description;

import java.util.List;

/**
 * 堆排序
 *
 * @author kevinfuture
 * @date 2017/11/30
 */
@Description("时间复杂度O(n*Log_2n),不稳定")
public interface IHeap {
    /**
     * 堆排序接口方法
     * @param doubles
     * @return list
     * @throws Throwable
     ***/
    List sortByAsc(double[] doubles) throws Throwable;
}
