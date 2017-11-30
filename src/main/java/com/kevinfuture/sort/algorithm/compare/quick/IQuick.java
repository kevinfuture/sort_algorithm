package com.kevinfuture.sort.algorithm.compare.quick;

import com.kevinfuture.sort.algorithm.annotation.Description;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 * 快排接口
 *
 * @author kevinfuture
 * @date 2017/11/29
 */
public interface IQuick {
    /**
     * 不稳定
     * 时间复杂度O(nLog2^2)
     * 最好复杂度O（n）最差复杂度O（n^2）
     * 空间复杂度O（nLog2^n）
     * @param doubles
     * @param orderEnum
     * @return List
     * @throws Throwable
     * **/
    @Description("算法时间复杂度O(nLog2^2)")
    List sort(double[] doubles, OrderEnum orderEnum) throws Throwable;
}
