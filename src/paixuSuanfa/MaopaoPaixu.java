package paixuSuanfa;

import java.util.Arrays;

/**
 * @Author Ning Nainian
 * @Date 2020/4/12 11:19
 * @Description 冒泡排序 平均时间复杂度O(n²),空间复杂度O(1)
 *
 * 原理：比较两个相邻的元素，将值大的元素交换至右端。
 *
 * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 * 然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。
 *
 * 第一趟比较完成后，最后一个数一定是数组中最大的一个数，所以第二趟比较的时候最后一个数不参与比较；
 *
 * 第二趟比较完成后，倒数第二个数也一定是数组中第二大的数，所以第三趟比较的时候最后两个数不参与比较；
 *
 * 依次类推，每一趟比较次数-1；
 *
 * https://www.cnblogs.com/shen-hua/p/5422676.html
 **/
public class MaopaoPaixu {

   public static void main(String[] args) {
       //要排序的数组，要求从小到大排序
       int[] arr = {2,1,3,5,4};
       for(int i=0;i<arr.length-1;i++){//要比较的趟数

            for(int j=0;j<arr.length-1-i;j++){//每趟要比较的次数
                //如果前面一个值比后面一个大，交换他们的位置
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       System.out.println(Arrays.toString(arr));

       /*for (int value:arr){
           System.out.println(value);
       }*/
   }



}