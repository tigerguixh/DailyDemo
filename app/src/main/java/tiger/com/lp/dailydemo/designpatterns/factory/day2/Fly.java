package tiger.com.lp.dailydemo.designpatterns.factory.day2;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/12
 * @Description :
 */
public class Fly implements Flyable{
    @Override
    public void fly() {
        System.out.println("我是一只小鸟，自由得飞翔。");
    }
}
