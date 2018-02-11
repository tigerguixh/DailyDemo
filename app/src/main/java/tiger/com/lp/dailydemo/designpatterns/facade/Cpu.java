package tiger.com.lp.dailydemo.designpatterns.facade;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public class Cpu implements Operation{

    @Override
    public void start() {
        System.out.println("start cpu.");
    }

    @Override
    public void shutDown() {
        System.out.println("shut down cpu");
    }
}
