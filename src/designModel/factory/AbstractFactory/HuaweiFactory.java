package designModel.factory.AbstractFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:35
 * @Description 华为手机工厂
 **/
public class HuaweiFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new KirinCpu();
    }

    @Override
    public Screen createScreen() {
        return new LGScreen();
    }
}