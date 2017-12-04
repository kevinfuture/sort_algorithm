package com.kevinfuture.sort.algorithm.select.heap.impl;

import com.kevinfuture.sort.algorithm.select.heap.AbstractHeap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * 二叉树
 * 堆排序的实现
 * @author kevinfuture
 * @date 2017/12/1
 */
public class HeapImpl extends AbstractHeap{
    /**
     * 堆排序算法步骤：
     * 1）：首先构建二叉树；也就是起始的数组，只是抽象成二叉树的形式(左子节点=父节点*2 + 1 ；右子节点=父节点*2 + 2)
     * 2）：其次，初始化堆（二叉树）；也就是保证父节点要大于左右子节点
     * 3）：第三，将最父节点与最子节点交换输出（最小输出），调整堆（初始化堆：保证父节点要大于左右子节点）
     * 4）：最后，重复第三步，直到堆大小为 0
     * **/
    @Override
    public List sortByAsc(double[] doubles) throws Throwable {
        //一、初始化整个数组为一个完整树；保证长度的一半即可完全遍历整个数组长度
        /**
         * 此处产生了问题，出现了子节点 > 父节点的情况
         * 分析可知 如果只进行一次parent=0的初始化树，则只保证了首树，后续的树没有再次进行数据变脸，因为parentVal是确定的
         * 为避免出现此种情况 二分之一倒叙遍历，保证了最小树的初始化
         * **/
        for(int i = doubles.length / 2; i >= 0  ; i--) {
            buildTree(doubles, i, doubles.length);
            System.out.println("first:  "+ DoubleStream.of(doubles).boxed().collect(Collectors.toList()));
        }
        //二、一步骤已完成一次堆的初始化，再次遍历排序不需要对这一次进行操作了，故为n-1次的复杂度操作
        for(int i = doubles.length - 1; i > 0 ; i--){
            //堆顶堆尾交换
            swap(doubles,i,0);
            //n-1堆再调整初始化
            buildTree(doubles,0,i);
//            System.out.println(i+" :  "+ DoubleStream.of(doubles).boxed().collect(Collectors.toList()));
        }
        List list = DoubleStream.of(doubles).boxed().collect(Collectors.toList());
        return list;
    }
    /**
     * 初始化堆（构建二叉树的堆）
     * 要点：
     * 1）：保证父节点要 > 左右子节点（不满足则交换）
     * 2）：保证左子节点 > 右子节点（不满足则交换）? 原因：眼下代码只能保证父节点 > 子节点，没有对于左右子节点进行置换操作
     * 3）：父节点位置（下标序号）<= 总排序长度的二分之一(PS：左右子节点=父节点*2 + 1或2；遍历前二分之一的父节点也就完成了全部的堆的初始化)
     * @param doubles
     * @param parent 父节点下标序号
     * @param len 长度
     * **/
    private void buildTree(double[] doubles, int parent, int len){
        //父节点值
        double parentVal = doubles[parent];
        //左子节点
        int child = 2 * parent + 1;
        while (child < len){
            //1、存在右子节点 && 左子节点 < 右子节点 ；则 子节点+1 =》 右子节点
            if(child + 1 < len && doubles[child] < doubles[child + 1]){
                //设置节点下标为右子节点下标
                child++;
            }
            //2、父节点值 >= 右子节点；则直接跳过，否则与父节点交换
            if(parentVal >= doubles[child]){
                break;
            }
            doubles[parent] = doubles[child];
            //3、父节点已产生，左子节点上升为父节点继续操作；次左子节点则为此左子节点 * 2 + 1
            parent = child;
            child = 2 * child + 1;
        }
        /**
         * 4、此时较为难以理解：
         * 1）：其实是针对起始parent序号完成树的初始化
         * 2）：当存在小于起始parent时，则交换下移
         * 3）：最终如果起始parent是最小的，则放置在最后（此时parent已经是最后一个不符合树规律的最子树节点）
         * 即：不符合情况的最子节点
         * **/
        doubles[parent] = parentVal;
    }
    /**
     * 交换律
     * 不引入第三方变量
     * **/
    private void swap(double[] doubles, int i, int j){
        doubles[i] = doubles[i] + doubles[j];
        doubles[j] = doubles[i] - doubles[j];
        doubles[i] = doubles[i] - doubles[j];
    }
}
