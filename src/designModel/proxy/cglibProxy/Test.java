package designModel.proxy.cglibProxy;


/**
 * @Author Ning Nainian
 * @Date 2020/5/1 11:53
 * @Description 测试方法
 **/
public class Test {
    public static void main(String[] args) {
        //目标对象
        Performer perform = new Performer();
        PerformProxy performProxy = new PerformProxy(perform);
        //生成代理对象
        Performer proxy = (Performer)performProxy.getProxyInstance();
        proxy.perform();
    }


}