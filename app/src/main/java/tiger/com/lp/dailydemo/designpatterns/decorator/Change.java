package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public abstract class Change implements TheGreatestSage{
    private TheGreatestSage greatestSage;

    public Change(TheGreatestSage greatestSage) {
        this.greatestSage = greatestSage;
    }

    @Override
    public void move() {
        if(greatestSage != null) {
           greatestSage.move();
        }
    }
}
