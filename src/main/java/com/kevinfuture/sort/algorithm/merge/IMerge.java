package com.kevinfuture.sort.algorithm.merge;

import com.kevinfuture.sort.algorithm.annotation.Description;

import java.util.List;

/**
 * 基数排序算法
 *
 * @author kevinfuture
 * @date 2017/12/5
 */
@Description("时间复杂度O(nLog2^n)，空间复杂度O（1）稳定性算法")
public interface IMerge {
    /**
     * 接口方法
     * @param doubles
     * @return list
     * @throws Throwable
     ***/
    List sortByAsc(double[] doubles) throws Throwable;
}
