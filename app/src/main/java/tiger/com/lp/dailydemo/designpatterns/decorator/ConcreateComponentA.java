package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class ConcreateComponentA extends Decorator{
    @Override
    public void operation() {
        super.operation();

        System.out.println("具体装饰对象A的操作。");
    }
}
