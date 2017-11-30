package com.kevinfuture.sort.algorithm.compare.bubble;

import com.kevinfuture.sort.algorithm.annotation.Description;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 * 冒泡排序接口
 * @author kevinfuture
 * @date 2017/11/28
 */
@Deprecated
@Description("稳定但不建议使用；O（n^2）")
public interface IBubbleSort<T> {
    /**
     * fetch data by rule id
     * @param ints rule id
     * @param orderEnum
     * @return void
     * @throws Throwable
     */
    @Description("接收int数组")
    List sort(int[] ints, OrderEnum orderEnum) throws Throwable;
    /**
     * fetch data by rule id
     * @param longs rule id
     * @param orderEnum
     * @return void
     * @throws Throwable
     */
    @Description("接收long数组")
    List sort(long[] longs, OrderEnum orderEnum) throws Throwable;
    /**
     * fetch data by rule id
     * @param doubles rule id
     * @param orderEnum
     * @return void
     * @throws Throwable
     */
    @Description("接收double数组")
    List sort(double[] doubles, OrderEnum orderEnum) throws Throwable;
}
