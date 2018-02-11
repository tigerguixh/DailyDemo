package tiger.com.lp.dailydemo.designpatterns.facade;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutDown();
    }
}
