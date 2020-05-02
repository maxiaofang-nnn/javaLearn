package designModel.proxy.jdkProxy;

import designModel.proxy.staticProxy.IPerform;
import designModel.proxy.staticProxy.Performer;

/**
 * @Author Ning Nainian
 * @Date 2020/5/1 11:53
 * @Description 测试方法
 **/
public class Test {
    public static void main(String[] args) {
        //目标对象
        IPerform perform = new Performer();
        //代理对象，将目标对象注入
        PerformProxy performProxy = new PerformProxy(perform);

        IPerform proxy = (IPerform)performProxy.getProxyInstance();
        //通过代理对象调用目标对象方法
        proxy.perform();

    }


}