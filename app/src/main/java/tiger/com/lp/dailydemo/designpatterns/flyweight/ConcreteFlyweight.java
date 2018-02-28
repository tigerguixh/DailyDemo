package tiger.com.lp.dailydemo.designpatterns.flyweight;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class ConcreteFlyweight extends Flyweight{
    private String string;

    public ConcreteFlyweight(String string) {
        this.string = string;
    }

    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight : " + string);
    }
}
