package com.kevinfuture.sort.algorithm.compare.quick.impl;

import com.kevinfuture.sort.algorithm.compare.ICompare;
import com.kevinfuture.sort.algorithm.compare.quick.AbstractQuick;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author kevinfuture
 * @date 2017/11/29
 */
public class QuickImpl extends AbstractQuick implements ICompare{
    @Override
    public List sort(double[] doubles, OrderEnum orderEnum) throws Throwable {
        quickSort(doubles,0,doubles.length-1);
        List doubleList = DoubleStream.of(doubles).boxed().collect(Collectors.toList());
        return doubleList;
    }

    /**
     * 快排 分治法：从前往后 && 从后往前
     *
     * **/
    private void quickSort(double[] doubles, int start, int end){
        if(start >= end){
            return;
        }
        //基准值(一般取第一个或最后一个)：以常量定义，表示方法内执行时不可变
        final double baseVal = doubles[start];
        //声明i、j作为前后扫描的变量
        int i = start,j=end;

        /**
         * 一、前后分治扫描排序
         * **/
        while (i < j) {
            //从后往前扫描，若遍历到后边的值 <= 基准值（这里为第一个值）则高位 赋值 给低位
            while(i < j && doubles[j] > baseVal){
                j--;
            }
            doubles[i] = doubles[j];
            //从前往后扫描，若遍历到后边的值 >= 基准值（这里为第一个值）则低位 赋值 给高位
            while(i < j && doubles[i] < baseVal){
                i++;
            }
            doubles[j] = doubles[i];
        }
        /**
         * 二、
         * 基准值将数据分为两组，一遍前后分治扫描后，i与j达到中间位置
         * 设置基准值所在的位置
         * **/
        doubles[i] = baseVal;
        /**
         * 三、
         * 递归分治，从中间往两边扩展
         * 要点在于：前后不同分组的切点：start、end设置到分割值的序号位置
         * **/
        //比原基准值小一个数为需要排序的分组
        quickSort(doubles,start,i-1);
        //比原基准值大一个数为需要排序的分组
        quickSort(doubles,i+1,end);
    }

}
