package designModel.factory.AbstractFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:39
 * @Description 小米手机工厂
 **/
public class XiaomiFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new SnapdragonCpu();
    }

    @Override
    public Screen createScreen() {
        return new SamsungScreen();
    }
}