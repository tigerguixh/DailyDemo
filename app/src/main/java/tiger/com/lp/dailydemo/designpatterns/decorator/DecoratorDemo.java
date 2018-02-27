package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class DecoratorDemo {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();

        ConcreateComponentA concreateComponentA = new ConcreateComponentA();
        ConcreateComponentB concreateComponentB = new ConcreateComponentB();

        concreateComponentA.setComponent(component);
        concreateComponentB.setComponent(concreateComponentA);

        concreateComponentB.operation();
    }
}
