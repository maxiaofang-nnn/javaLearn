package designModel.singleton;

/**
 * @Description 懒汉单例模式（在使用到实例时才初始化实例）
 * 懒汉单例模式在多线程环境下，若多个线程调用获取实例方法，此时实例未初始化，会生成多个实例，
 * 违背单例模式的思想，因此懒汉单例模式要上锁避免这种情况
 * @Author Ning Nainian
 * @Date 2020/2/22 16:09
 **/
public class LazySingleton {
    //私有化构造方法，避免在外部被初始化
    //private void LazySingleton(){}
    private static LazySingleton singleton = null;

    //使用synchronize上锁，避免出现多个实例的情况
    //也可以使用静态内部类实现，此处不做介绍，请参考：https://blog.csdn.net/jason0539/article/details/23297037
    public static LazySingleton getSingleton(){
        if(singleton==null){
            if(singleton==null){
                synchronized(LazySingleton.class){
                    singleton = new LazySingleton();
                    return singleton;
                }
            }
        }
        return singleton;

    }

}