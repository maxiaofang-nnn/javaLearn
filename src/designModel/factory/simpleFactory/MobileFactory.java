package designModel.factory.simpleFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/23 18:00
 * @Description 生产手机的具体工厂类
 **/
public class MobileFactory {
    public Mobile cretaeMobie(String type){
        switch(type){
            case "huawei":
                return new Huawei();

            case "xiaomi":
                return new Xiaomi();

            default:
                break;
        }
        return null;
    }

}