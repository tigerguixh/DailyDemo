package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public class Fish extends Change{
    public Fish(TheGreatestSage greatestSage) {
        super(greatestSage);
    }

    @Override
    public void move() {
        super.move();

        System.out.println("我变成一只小鱼儿。");
    }
}
