package com.kevinfuture.sort.algorithm.insert.shell.impl;

import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;
import com.kevinfuture.sort.algorithm.insert.shell.AbstractShell;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * 也称递减增量排序算法
 * @author kevinfuture
 * @date 2017/12/4
 */
public class ShellImpl extends AbstractShell {
    /**
     * 要点：1）：除2，确定步长，每隔步长取出下标对应值成一组数据；2）：排序当前组数据，不符合则交换；3）：依次遍历剩余数据；4）：重复步长除2的步骤
     * 步骤：
     * 1）：遍历 数组长度/2（步长值）
     * 2）：从步长值开始，遍历数组数据
     * 3）：根据步长，遍历一组数据 =》排序，然后遍历步长长度 步长序号 * 步长 = 第二组、第三组、、（用于所有元素都能遍历一遍）
     * **/
    @Override
    public List sort(double[] doubles, OrderEnum orderEnum) throws Throwable {
        //1）：遍历 数组长度/2 = 步长值
        for(int step = doubles.length/2; step >0; step = step/2 ){
            for(int i = step; i < doubles.length; i++){
                //要点：1）：j要从0开始，保证索引的正确；2）：倒序思索更容易理解，每完成一次循环，j值 - step 表示获取前一个步长的val值，依次循环遍历
                //实际上此处有些空跑的情况，可以优化
                for(int j = i - step; j >= 0; j = j - step){
                    //步长间的两个值比较：i.val > (i+step).val则交换，此处循环就是为了循环遍历交换
                    if(doubles[j] > doubles[j + step]){
                        swap(doubles,j,j+step);
                    }
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
