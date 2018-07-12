package tiger.com.lp.dailydemo.designpatterns.factory.day2;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/12
 * @Description :
 */
public class ConcreteFactory extends AbstractFactory{
    @Override
    public Flyable concreteFly() {
        return new Fly();
    }

    @Override
    public Penable concretePen() {
        return new Pen();
    }
}
