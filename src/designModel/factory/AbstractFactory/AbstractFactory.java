package designModel.factory.AbstractFactory;
/**
 *
 * @Description 抽象工厂
 * @Author Ning Nainian
 * @param null :
 * @Date 2020/4/25 15:33
 */
public interface AbstractFactory {
    public Cpu createCpu();
    public Screen createScreen();
}
