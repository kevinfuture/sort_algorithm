package com.kevinfuture.sort.algorithm.radix;

import com.kevinfuture.sort.algorithm.annotation.Description;

import java.util.List;

/**
 * 基数排序算法
 *
 * @author kevinfuture
 * @date 2017/12/5
 */
@Description("时间复杂度O(d(r+n))，空间复杂度O（rd+n）,r表示关键字的基数，d表示长度，n表示关键字个数；稳定性算法")
public interface IRadix {
    /**
     * 接口方法
     * @param doubles
     * @return list
     * @throws Throwable
     ***/
    List sortByAsc(double[] doubles) throws Throwable;
}
