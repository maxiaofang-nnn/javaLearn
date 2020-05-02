package designModel.factory.AbstractFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:31
 * @Description LG屏幕具体实现类
 **/
public class LGScreen implements Screen{
    @Override
    public void createScreen() {
        System.out.println("生产LG屏幕");
    }
}