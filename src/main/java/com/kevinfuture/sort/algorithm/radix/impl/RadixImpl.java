package com.kevinfuture.sort.algorithm.radix.impl;

import com.kevinfuture.sort.algorithm.radix.AbstractRadix;

import java.util.List;

/**
 * 基数排序算法实现
 * @author kevinfuture
 * @date 2017/12/5
 */
public class RadixImpl extends AbstractRadix{
    @Override
    public List sortByAsc(double[] doubles) throws Throwable {
        int max = getHighOrder(doubles);
        double[][] bucket = new double[max][doubles.length];
        double[] single = new double[doubles.length];
        int num;
       /**
        * 此算法用处未发现，不想再去实现，此处只表述思想，不再去实现
        * 步骤：
        * 1）：获取所有数据最高位的位数
        * 2）：遍历位数，依次余 10，得余数
        * 3）：将所有余数放置与一个数组，或者是二维数组内
        * 4）：然后遍历一遍二维数组，将所有当前最低位的数据进行排序
        * 5）：被余数据乘10进行下一次循环
        * 6）：直到所有位数被比较完全
        * **/
        return null;
    }
    /**
     * 计算所有数据中最高位数
     * **/
    private int getHighOrder(double[] doubles){
        int hightOrder = 0;
        for(int i = 0; i < doubles.length; i++ ){
            double val = doubles[i];
            int thisOrder = 1;
            while ((val /= 10) > 10){
                thisOrder++;
            }
            if(thisOrder > hightOrder){
                hightOrder = thisOrder;
            }
        }
        return hightOrder;
    }
}
