import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author Ning Nainian
 * @Date 2020/3/14 19:36
 * @Description
 * 内存泄漏测试例子
 **/
public class MemoryLeak {
    public static void main(String[] args) {
        Vector vector = new Vector();
        List list = new ArrayList();

        while(true){
            Object object = new Object();
            list.add(object);
            object = null;

            /*try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
    }



}