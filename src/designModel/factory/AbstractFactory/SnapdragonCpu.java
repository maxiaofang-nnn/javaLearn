package designModel.factory.AbstractFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:26
 * @Description 骁龙cpu具体实现类
 **/
public class SnapdragonCpu implements Cpu {
    @Override
    public void createCpu() {
        System.out.println("生产骁龙cpu");
    }
}