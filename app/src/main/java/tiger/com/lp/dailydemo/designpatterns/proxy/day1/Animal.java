package tiger.com.lp.dailydemo.designpatterns.proxy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/1
 * @Description :
 */
public class Animal implements Fly, Run{
    @Override
    public void fly() {
        System.out.println("This is animal fly.");
    }

    @Override
    public void run() {
        System.out.println("This is animal fly.");
    }
}
