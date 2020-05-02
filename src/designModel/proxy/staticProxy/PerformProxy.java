package designModel.proxy.staticProxy;

/**
 * @Author Ning Nainian
 * @Date 2020/5/1 11:45
 * @Description 表演代理类
 **/

//代理类与目标类实现同一个接口
public class PerformProxy implements IPerform {
    //接收目标对象
    private  IPerform target;

    public PerformProxy(IPerform perform) {
        this.target = perform;
    }

    @Override
    public void perform() {
        //表演前先向观众们问好
        System.out.println("各位观众朋友们大家好");
        //调用目标方法
        target.perform();
        //表演完成向观众致谢
        System.out.println("感谢大家的观看");
    }
}