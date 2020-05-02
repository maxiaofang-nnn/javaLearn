import sun.applet.Main;

import java.math.BigDecimal;

/**
 * @Author Ning Nainian
 * @Date 2020/3/12 11:30
 * @Description
 * 死循环
 * 使占用大量cpu
 **/
public class DieCycle implements Runnable {
    public static void main(String[] args) {
        DieCycle d1 = new DieCycle();
        DieCycle d2 = new DieCycle();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();
    }

    public void run(){
        int sum2 = 1;
        while(true){
            sum2 += 1;
            System.out.println(
                    sum2
            );
        }
    }

}