import sun.applet.Main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Ning Nainian
 * @Date 2020/3/12 11:30
 * @Description
 **/
public class Test {
    public static void main(String[] argv) {
        int[] arr = {3,2,6,1,0,9};

        for (int i=0; i<arr.length; i++){
            /*6
            0 1 2 3 4 5 */
            System.out.println(i);


        }
        /*int sum2 = 1;
        while(true){
            sum2 += 1;
            System.out.println(
                    sum2
            );
        }*/

       /* for (int i=0;i<100000000;i++) {
            System.out.println(123);
        }*/
        //int i = getInt(1);
        /*Test test = new Test();
        test.getInt();*/

       /* int i = 'z' - 'a';
        System.out.println(i);*/
        char a = '你';
        char d = 'd';
        System.out.println(d - a);

    }

    /*int i = 0;
    public void getInt(){
        i++;
        getInt();
    }*/

    public static void sort(int[] array) {
        //希尔排序的增量
        int d = array.length;
        while (d > 1) {
        //使用希尔增量的方式，即每次折半
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < array.length; i = i + d) {
                    int temp = array[i];
                    int j;
                    for (j = i - d; j >= 0 && array[j] > temp; j = j - d) {
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }
        }
    }

    /*public static void main(String[] args) {
        int[] array = {5, 3, 9, 12, 6, 1, 7, 2, 4, 11, 8, 10};
        sort(array);
        System.out.println(Arrays.toString(array));
    }*/

}