package designModel.proxy.staticProxy;

/**
 * @Author Ning Nainian
 * @Date 2020/5/1 11:42
 * @Description 表演者目标类
 **/
public class Performer implements IPerform {
    @Override
    public void perform() {
        System.out.println("表演才艺");
    }
}