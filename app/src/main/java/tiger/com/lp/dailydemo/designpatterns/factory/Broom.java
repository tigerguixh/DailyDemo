package tiger.com.lp.dailydemo.designpatterns.factory;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class Broom implements Moveable{
    @Override
    public void run() {
        System.out.println("I am tiger, by the way.");
    }
}
