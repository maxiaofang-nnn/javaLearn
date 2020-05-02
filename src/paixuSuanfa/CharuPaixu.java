package paixuSuanfa;

import java.util.Arrays;

/**
 * @Author Ning Nainian
 * @Date 2020/4/12 23:51
 * @Description 直接插入排序
 *
 * 将一个记录插入到已排序好的有序表中，从而得到一个新的，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
 **/
public class CharuPaixu {

    public static void main(String[] args){
        //要排序的数组，从小到大排列
        int[] arr = {2,4,1,9,8,0};

        for (int i=1; i<arr.length; i++){//选取第一个元素为有序序列，故i从1开始

            for (int j=i; j>0; j--){//从后往前，与前面的有序序列依次进行比较
                if (arr[j]<arr[j-1]){//如果后面一个数比前面一个数大，交换他们的位置
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }


}