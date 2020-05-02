package designModel.factory.factoryMethod;

import static javafx.scene.input.KeyCode.X;

/**
 * @Author Ning Nainian
 * @Date 2020/4/24 12:30
 * @Description 客户端测试
 **/
public class Customer {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Mobile huawei = huaweiFactory.createMobile();
        huawei.createMobile();

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Mobile xiaomi = xiaomiFactory.createMobile();
        xiaomi.createMobile();
    }
}