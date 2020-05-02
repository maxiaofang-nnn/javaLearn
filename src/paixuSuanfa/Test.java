package paixuSuanfa;

import java.util.Arrays;

/**
 * @Author Ning Nainian
 * @Date 2020/4/16 16:37
 * @Description
 **/
public class Test {
    public static void main(String[] args) {

        int[] arr = {3,1,4,2,5};
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j>0; j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}