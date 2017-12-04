package com.kevinfuture.sort.algorithm.insert.shell;

import com.kevinfuture.sort.algorithm.annotation.Description;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 * 希尔排序
 *
 * @author kevinfuture
 * @date 2017/12/4
 */
@Description("时间复杂度O（n^1.3），空间复杂度O（1），不稳定性算法")
public interface IShell {
    /**
     * 排序接口方法
     * @param doubles
     * @param orderEnum
     * @return list
     * @throws Throwable
     ***/
    List sort(double[] doubles, OrderEnum orderEnum) throws Throwable;
}
