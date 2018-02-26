package tiger.com.lp.dailydemo.designpatterns.factory;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class FactoryDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable moveable = factory.create();
        moveable.run();
    }
}
