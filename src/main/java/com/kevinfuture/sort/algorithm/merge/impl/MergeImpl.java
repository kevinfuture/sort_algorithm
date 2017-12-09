package com.kevinfuture.sort.algorithm.merge.impl;

import com.kevinfuture.sort.algorithm.merge.AbstractMerge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author kevinfuture
 * @date 2017/12/5
 */
public class MergeImpl extends AbstractMerge{
    /**
     * 归并算法是一种高效稳定的算法；相比其他排序算法，归并整体效果最好
     * 思想：
     * 1）：将一组数据拆分；一直拆分到仅剩一个元素
     * 2）：比较两个从父级拆分下来的数据，合并到一块，一直合并到原数组长度的一半
     * 3）：此时两个子数组从各自起始数据开始比较，较小的置于前置位
     *
     * PS：可采用遍历的方式，也可采用递归方式处理
     * **/
    @Override
    public List sortByAsc(double[] doubles) throws Throwable {
        segment(doubles,0,doubles.length-1);
        List list = DoubleStream.of(doubles).boxed().collect(Collectors.toList());
        return list;
    }

    /**
     * 思索有问题：无法进行左右拆分
     * 拆/分割 数据
     * 要点不断的将数据分组拆分
     * 1）：每次递归设置一个中间序号值，作为切分点（长度的一半）
     * 2）：一直递归拆分到最终，也就是mid <= 1，这时候一个数组中仅有一个值
     * 3）：由于最终组不符合mid <=1，故向上一组数组比较大小，然后排序
     * **/
    private void segment1(double[] doubles, int mid){
        if(mid <= 1){
            return;
        }
        mid = doubles.length / 2;
        segment1(doubles,mid);
    }
    /**
     * 拆/分割 数据
     * 不断的将数据分组拆分，
     * 1）：每次递归设置一个中间序号值，作为切分点（中间值 = 【start + end 】/2）
     * 2）：一直递归拆分到最终，也就是start <= end，这时候一个数组中仅有一个值
     * 3）：最终组不符合start <= end，递归结束
     * PS：完成拆分之后就可以 数组比较大小，然后排序
     * **/
    private void segment(double[] doubles, int start, int end){
        //跳出的条件
        if(start >= end){
            return;
        }
        int mid = (start + end) / 2;
        //向左拆分
        segment(doubles,start,mid);
        //向右拆分 mid+1此开始拆分
        segment(doubles,mid + 1,end);
        //合并数据
        merge(doubles,start,end,mid);
    }
    /**
     * 合并数据
     * 要点概述（数据组是不变的）：
     * 1）：当起始调用此方法时，start = end ；
     * 2）：同时传入mid值，用于区分左右子树索引
     * 3）：当左子树索引小于等于右子树索引时，将左子树索引对应值放置在临时数组的最左边，反之，取右子树；
     * 4）：处理边界位置
     * 5）：结束排序之后，将已排序子数组替换原数组位置的数据
     * 6）：重复递归遍历，完成排序
     * **/
    private void merge(double[] doubles, int start, int end, int mid){
        double[] doublesChild = new double[doubles.length];
        //保存临时索引值
        int startIndex = start;
        //mid+1次开始作为右分拆的第一个索引值
        int startIndexMid = mid + 1;

        int startBak = start;

        while (start <= mid && startIndexMid <= end){
            //左子数组序号值 < 右子树前一值则从左子数组取一值放到临时数组中；否则，取反方向
           if(doubles[start] <= doubles[startIndexMid]){
               doublesChild[startIndex++] = doubles[start++];
           }else{
               doublesChild[startIndex++] = doubles[startIndexMid++];
           }
        }
        //当start <= mid时，表示左子数组没有遍历完全，处理收尾边界的位置
        while (start <= mid){
            doublesChild[startIndex++] = doubles[start++];
        }
        //startIndexMid <= end时，表示右子数组没有遍历完全，处理收尾边界的位置
        while (startIndexMid <= end){
            doublesChild[startIndex++] = doubles[startIndexMid++];
        }
        //从起始start位置，将排序数据替换原数组对应位置数据
        while (startBak <= end){
            doubles[startBak] = doublesChild[startBak++];
        }
//        System.out.println(DoubleStream.of(doubles).boxed().collect(Collectors.toList()));
    }
}
