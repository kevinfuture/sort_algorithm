package com.kevinfuture.sort.algorithm.select.heap;

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
     * @return list
     * @throws Throwable
     ***/
    List sortByAsc(double[] doubles) throws Throwable;
}
