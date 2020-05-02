package paixuSuanfa;

import java.util.Arrays;

/**
 * @Author Ning Nainian
 * @Date 2020/4/15 10:38
 * @Description 选择排序
 **/
public class XuanzePaixu {
    public static void main(String[] args){
        //要求从小到大排列
        int[] arr = {4,11,3,2,-5};



        for (int i=0; i<arr.length; i++){//遍历整个数组
            int minPos = i;//记录最小值的位置

            for (int j=i+1; j<arr.length; j++){

                //如果后面一个数比当前的数小，记录这个位置
                if (arr[j]<arr[minPos]){
                    minPos = j;
                }
            }

            //一次遍历完成，将遍历中最小的值与遍历初始位置的值交换
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }


}