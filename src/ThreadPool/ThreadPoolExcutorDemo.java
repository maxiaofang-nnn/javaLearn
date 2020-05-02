package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class ThreadPoolExcutorDemo {

    public static void main(String[] args) {
        //等待线程队列
        ArrayBlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<Runnable>(5);
        ThreadPoolExecutor pool=new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, workQueue);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            MyTask myTask=new MyTask(i);
            pool.execute(myTask);
            System.out.println("线程池线程数量："+pool.getPoolSize()+",队列中等待线程数："+pool.getQueue().size()+",已执行完线程数量："+pool.getCompletedTaskCount());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行耗费时间："+ (endTime - startTime));
        System.out.println(pool.isShutdown());
        pool.shutdown();
        System.out.println(pool.isShutdown());
        System.out.println(pool.isTerminated());
    }

}

/**
 *
 */
class MyTask implements Runnable{

    public int taskNum;

    public MyTask(int num){
        this.taskNum=num;
    }
    @Override
    public void run() {
        System.out.println("正在执行task"+taskNum);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务task"+taskNum+"执行完毕");
    }

}
