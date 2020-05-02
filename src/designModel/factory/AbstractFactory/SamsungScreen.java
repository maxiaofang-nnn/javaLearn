package designModel.factory.AbstractFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:29
 * @Description 三星屏幕具体实现类
 **/
public class SamsungScreen implements Screen {
    @Override
    public void createScreen() {
        System.out.println("生产三星屏幕");
    }
}