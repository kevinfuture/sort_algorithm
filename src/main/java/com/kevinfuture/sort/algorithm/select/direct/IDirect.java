package com.kevinfuture.sort.algorithm.select.direct;

import com.kevinfuture.sort.algorithm.annotation.Description;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 * 直接选择排序接口
 *
 * @author kevinfuture
 * @date 2017/11/30
 */
@Deprecated
@Description("时间复杂度O（n^2），空间复杂度O（1），稳定性算法")
public interface IDirect {
    /**
     * 直接排序接口方法
     * @param doubles
     * @param orderEnum
     * @return list
     * @throws Throwable
     ***/
    List sort(double[] doubles, OrderEnum orderEnum) throws Throwable;
}
