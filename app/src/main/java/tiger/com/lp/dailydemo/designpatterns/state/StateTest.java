package tiger.com.lp.dailydemo.designpatterns.state;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new Rain());
        System.out.println("今天啥天气： " + context.stateInfo());
        context.setState(new Sunshine());
        System.out.println("今天啥天气： " + context.stateInfo());
    }
}
