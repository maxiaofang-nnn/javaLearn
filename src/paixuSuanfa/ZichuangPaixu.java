package paixuSuanfa;

import java.util.Arrays;

/**
 * @Author Ning Nainian
 * @Date 2020/4/15 10:38
 * @Description 自创的排序算法
 *
 * 算是比较烂的排序算法
 **/
public class ZichuangPaixu {
    public static void main(String[] args){

        int[] arr = {4,11,3,2,-5};
        /**
         * 要求从小到大排列
         * 思路：
         *第一步：1号位置元素与2号位置元素比较，如果2号位置元素小，将1号与2号位置的元素交换；
         *        1号位置元素与3号位置元素比较，如果3号位置元素小，将1号与3号位置的元素交换……n号位置元素与1号位置元素比较，
         *        如果n号位置元素小，将1号与n号位置的元素交换，
         *        第一次循环下来，最小的元素将会放到1号位置
         * 第二步：2号位置元素与3号位置元素比较，如果3号位置元素小，将2号与3号位置的元素交换；
         *         2号位置元素与4号位置元素比较，如果4号位置元素小，将2号与4号位置的元素交换……
         *         用这样的方法遍历完，次小的元素将会放到2号位置
         *
         * 用这样的方法遍历完所有元素，就可以得到一个有小到大排列的序列
         *
         */

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));




    }



}