package designModel.factory.factoryMethod;



/**
 * @Author Ning Nainian
 * @Date 2020/4/23 17:58
 * @Description 具体手机类-小米
 **/
public class Xiaomi implements Mobile {
    @Override
    public void createMobile() {
        System.out.println("生产小米手机");
    }
}