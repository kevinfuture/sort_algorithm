package com.kevinfuture.sort.algorithm.compare.quick.impl;

import com.kevinfuture.sort.algorithm.compare.ICompare;
import com.kevinfuture.sort.algorithm.compare.quick.AbstractQuick;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;

import java.util.List;

/**
 *
 * @author kevinfuture
 * @date 2017/11/29
 */
public class QuickImpl extends AbstractQuick implements ICompare{
    @Override
    public List sort(double[] doubles, OrderEnum orderEnum) throws Throwable {


        return null;
    }

    /**
     * 快排 分治法：从前往后 && 从后往前
     *
     * **/
    private void quickSort(double[] doubles, int start, int end){
        if(start >= end){
            return;
        }
        //声明i、j作为前后扫描的变量
        int i = start,j=end;
        //1、前后分治扫描排序
        while (i < j) {
            //从后往前扫描，若遍历到后边的值 <= 基准值（这里为第一个值）则高位 赋值 给低位
            while(i < j && doubles[j] > doubles[start]){
                j--;
            }
            doubles[i] = doubles[j];
            //从前往后扫描，若遍历到后边的值 >= 基准值（这里为第一个值）则低位 赋值 给高位
            while(i < j && doubles[i] < doubles[start]){
                i++;
            }
            doubles[j] = doubles[i];
        }
    }
    /**
     * 不引入第三变量 交换
     * **/
    private void swap(double[] doubles, int i, int j){
        doubles[i] = doubles[i] + doubles[j];
        doubles[j] = doubles[i] - doubles[j];
        doubles[i] = doubles[i] - doubles[j];
    }
}
