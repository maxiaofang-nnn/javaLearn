package designModel.factory.AbstractFactory;


/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:40
 * @Description 客户端测试
 **/
public class Customer {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Cpu huaweiCpu =  huaweiFactory.createCpu();
        huaweiCpu.createCpu();
        Screen huaweiScreen = huaweiFactory.createScreen();
        huaweiScreen.createScreen();

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Cpu xiaomiCpu = xiaomiFactory.createCpu();
        xiaomiCpu.createCpu();
        Screen xiaomiScreen = xiaomiFactory.createScreen();
        xiaomiScreen.createScreen();



    }
}