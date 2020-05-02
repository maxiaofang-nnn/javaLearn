package designModel.proxy.jdkProxy;

import designModel.proxy.staticProxy.IPerform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @Author Ning Nainian
 * @Date 2020/5/1 11:45
 * @Description 表演代理类
 **/

public class PerformProxy {
    //接收目标对象
    private  IPerform target;

    public PerformProxy(IPerform perform) {
        this.target = perform;
    }

    //使用jdk动态代理，为目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            Object proxy,
                            Method method,
                            Object[] args)
                            throws Throwable {
                        //表演前先向观众们问好
                        System.out.println("各位观众朋友们大家好");
                        //调用目标方法
                        Object returnValue = method.invoke(target, args);
                        //表演完成向观众致谢
                        System.out.println("感谢大家的观看");
                        return returnValue;
                    }
                });

    }



}