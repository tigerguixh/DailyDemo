package tiger.com.lp.dailydemo.designpatterns.factory.day2;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/12
 * @Description :
 */
public class ConcreteClient {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory();

        Flyable fly = abstractFactory.concreteFly();
        fly.fly();

        Penable pen = abstractFactory.concretePen();
        pen.pen();
    }
}
