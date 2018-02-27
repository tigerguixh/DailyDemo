package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public class ConcreatePersonB extends AbsConPerson{
    @Override
    public void show() {
        System.out.println("穿个短袖。");

        super.show();
    }
}
