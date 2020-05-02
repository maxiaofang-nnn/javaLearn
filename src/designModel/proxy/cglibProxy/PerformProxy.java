package designModel.proxy.cglibProxy;

import designModel.proxy.staticProxy.IPerform;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Ning Nainian
 * @Date 2020/5/1 11:45
 * @Description 表演代理类
 **/

public class PerformProxy implements MethodInterceptor {
    //接收目标对象
    private  Object  target;
    public PerformProxy(Object  perform) {
        this.target = perform;
    }

    //获取目标对象的代理对象
    public Object getProxyInstance(){
        //工具类
        Enhancer en = new Enhancer();
        //设置父类对象
        en.setSuperclass(this.target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建子类，也就是代理对象
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //表演前先向观众们问好
        System.out.println("各位观众朋友们大家好");
        //执行目标对象的方法
        Object returnValue = method.invoke(target, objects);
        //表演完成向观众致谢
        System.out.println("感谢大家的观看");
        return returnValue;
    }
}