package com.kevinfuture.sort.algorithm.select.direct.impl;

import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;
import com.kevinfuture.sort.algorithm.select.direct.AbstractDirect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * 直接选择排序，实现
 * @author kevinfuture
 * @date 2017/12/1
 */
public class DirectImpl extends AbstractDirect {
    @Override
    public List sort(double[] doubles, OrderEnum orderEnum) throws Throwable {
       if(OrderEnum.asc.equals(orderEnum)){
           int min;
           for(int i = 0; i < doubles.length - 1; i++){
               //开始假设最小为起始值
               min = i;
               for(int j = i + 1; j < doubles.length; j ++){
                   if(doubles[min] > doubles[j]){
                       //遇到比起始值小的则交换序号
                       min = j;
                   }
               }
               //一次遍历之后，将最小值与起始值交换
               if(i != min){
                   swap(doubles,i,min);
               }
           }
       }else {
           int min;
           for(int i = 0; i < doubles.length - 1; i++){
               //开始假设最小为起始值
               min = i;
               for(int j = i + 1; j < doubles.length; j ++){
                   if(doubles[min] < doubles[j]){
                       //遇到比起始值小的则交换序号
                       min = j;
                   }
               }
               //一次遍历之后，将最小值与起始值交换
               if(i != min){
                   swap(doubles,i,min);
               }
           }
       }
        List list = DoubleStream.of(doubles).boxed().collect(Collectors.toList());
        return list;
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
