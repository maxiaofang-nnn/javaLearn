package designModel.factory.AbstractFactory;

/**
 * @Author Ning Nainian
 * @Date 2020/4/25 15:22
 * @Description 麒麟cpu具体实现类
 **/
public class KirinCpu implements Cpu {
    @Override
    public void createCpu() {
        System.out.println("生产麒麟cpu");
    }
}