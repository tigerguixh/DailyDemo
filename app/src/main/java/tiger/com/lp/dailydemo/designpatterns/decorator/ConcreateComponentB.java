package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class ConcreateComponentB extends Decorator{
    @Override
    public void operation() {
        super.operation();

        System.out.println("具体操作对象B的操作。");
    }
}
