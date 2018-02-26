package tiger.com.lp.dailydemo.designpatterns.factory;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class BroomFactory extends VehicleFactory{
    @Override
    public Moveable create() {
        return new Broom();
    }
}
