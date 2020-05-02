package designModel.factory.simpleFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/23 17:55
 * @Description 具体手机类-华为
 **/
public class Huawei implements Mobile {

    @Override
    public void createMobile() {
        System.out.println("生产华为手机");
    }

}