package com.kevinfuture.sort.algorithm.insert.direct.impl;

import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;
import com.kevinfuture.sort.algorithm.insert.direct.AbstractInsertDirect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author kevinfuture
 * @date 2017/12/4
 */
public class InsertDirectImpl extends AbstractInsertDirect {
    /**
     * 直接插入思想：
     * 1）：基准值 i下标
     * 2）：若 val[i] < val[i-1] (前一个值 大于 后一个值)；将val[i-1]之前的后移
     * 网上很多都是交换而不是后移，虽然使用了遍历，但是条件限制只能是进行了一次操作，对于这个算法我很有疑问
     * **/
    @Override
    public List sort(double[] doubles, OrderEnum orderEnum) throws Throwable {

        for(int i = 1; i < doubles.length; i++){
            if(doubles[i] < doubles[i - 1]){
                double baseVal = doubles[i];
                int j;
                for(j = i -1; j >=0 && baseVal < doubles[j]; j--){
                    doubles[j+1] = doubles[j];
                }
                doubles[j+1] = baseVal;
            }
        }
        List list = DoubleStream.of(doubles).boxed().collect(Collectors.toList());
        return list;
    }
}
