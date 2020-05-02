package designModel.proxy.staticProxy;

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
        IPerform performProxy = new PerformProxy(perform);

        performProxy.perform();
    }


}