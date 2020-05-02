package designModel.factory.simpleFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/23 18:09
 * @Description 客户端测试
 **/
public class Customer {

    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();
        Mobile huaweiMobile = mobileFactory.cretaeMobie("huawei");
        huaweiMobile.createMobile();

        Mobile xiaomiMobile = mobileFactory.cretaeMobie("xiaomi");
        xiaomiMobile.createMobile();

    }

}