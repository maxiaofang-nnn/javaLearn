package designModel.factory.factoryMethod;

/**
 * @Author Ning Nainian
 * @Date 2020/4/24 12:21
 * @Description 小米工厂类
 **/
public class XiaomiFactory implements AbstractFactory {
    @Override
    public Mobile createMobile() {
            return new Xiaomi();
    }
}