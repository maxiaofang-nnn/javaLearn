package designModel.singleton;

import ThreadPool.ThreadPoolExcutorDemo;

/**
 * @Description 饿汉单例模式（在类初始化的时候就创建实例）
 * @Author Ning Nainian
 * @Date 2020/2/22 12:27
 **/
public class HungerSingelton {
    //私有化构造方法，避免在外部被实例化
    private void  getSingleton(){}
    //在类初始化时创建实例
    private static HungerSingelton singelton = new HungerSingelton();

    public static HungerSingelton getSingelton(){
        return singelton;
    }


}