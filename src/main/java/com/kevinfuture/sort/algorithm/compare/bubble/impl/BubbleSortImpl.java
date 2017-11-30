package com.kevinfuture.sort.algorithm.compare.bubble.impl;

import com.kevinfuture.sort.algorithm.compare.ICompare;
import com.kevinfuture.sort.algorithm.compare.bubble.AbstractBubbleSort;
import com.kevinfuture.sort.algorithm.enums.IEnum;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * 冒泡排序实现一
 * PS：可能会有多种实现方式
 * @author kevinfuture
 * @date 2017/11/28
 */
public class BubbleSortImpl extends AbstractBubbleSort implements ICompare{
    @Override
    public List sort(int[] ints, OrderEnum orderEnum) throws Throwable {
        if(OrderEnum.asc.equals(orderEnum)) {
            for (int i = 0; i < ints.length; i++) {
                for (int j = i + 1; j < ints.length; j++) {
                    if (ints[i] > ints[j]) {
                        /**
                         * 交换律
                         * 不引入第三方变量
                         * **/
                        ints[i] = ints[i] + ints[j];
                        ints[j] = ints[i] - ints[j];
                        ints[i] = ints[i] - ints[j];
                        continue;
                    }
                }
            }
        }else{
            for (int i = 0; i < ints.length; i++) {
                for (int j = i + 1; j < ints.length; j++) {
                    if (ints[i] < ints[j]) {
                        /**
                         * 交换律
                         * 不引入第三方变量
                         * **/
                        ints[i] = ints[i] + ints[j];
                        ints[j] = ints[i] - ints[j];
                        ints[i] = ints[i] - ints[j];
                        continue;
                    }
                }
            }
        }
        List list = IntStream.of(ints).boxed().collect(Collectors.toList());
        return list;
    }

    @Override
    public List sort(long[] longs, OrderEnum orderEnum) throws Throwable {
        if(OrderEnum.asc.equals(orderEnum)) {
            for (int i = 0; i < longs.length; i++) {
                for (int j = i + 1; j < longs.length; j++) {
                    if (longs[i] > longs[j]) {
                        longs[i] = longs[i] + longs[j];
                        longs[j] = longs[i] - longs[j];
                        longs[i] = longs[i] - longs[j];
                        continue;
                    }
                }
            }
        }else {
            for (int i = 0; i < longs.length; i++) {
                for (int j = i + 1; j < longs.length; j++) {
                    if (longs[i] < longs[j]) {
                        longs[i] = longs[i] + longs[j];
                        longs[j] = longs[i] - longs[j];
                        longs[i] = longs[i] - longs[j];
                        continue;
                    }
                }
            }
        }
        List list = LongStream.of(longs).boxed().collect(Collectors.toList());
        return list;
    }

    @Override
    public List sort(double[] doubles, OrderEnum orderEnum) throws Throwable {
        if(OrderEnum.asc.equals(orderEnum)) {
            for (int i = 0; i < doubles.length; i++) {
                for (int j = i + 1; j < doubles.length; j++) {
                    if (doubles[i] > doubles[j]) {
                        doubles[i] = doubles[i] + doubles[j];
                        doubles[j] = doubles[i] - doubles[j];
                        doubles[i] = doubles[i] - doubles[j];
                        continue;
                    }
                }
            }
        }else {
            for (int i = 0; i < doubles.length; i++) {
                for (int j = i + 1; j < doubles.length; j++) {
                    if (doubles[i] < doubles[j]) {
                        doubles[i] = doubles[i] + doubles[j];
                        doubles[j] = doubles[i] - doubles[j];
                        doubles[i] = doubles[i] - doubles[j];
                        continue;
                    }
                }
            }
        }
        List list = DoubleStream.of(doubles).boxed().collect(Collectors.toList());
        return list;
    }
}
