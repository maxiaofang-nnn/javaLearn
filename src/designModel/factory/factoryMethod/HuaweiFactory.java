package designModel.factory.factoryMethod;

/**
 * @Author Ning Nainian
 * @Date 2020/4/24 12:20
 * @Description 华为工厂类
 **/
public class HuaweiFactory implements AbstractFactory {
    @Override
    public Mobile createMobile() {
        return new Huawei();
    }
}