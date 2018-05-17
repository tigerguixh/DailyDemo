package tiger.com.lp.dailydemo.designpatterns.observer;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public abstract class DemoObservable extends AbstractObservable<Demo>{

    public DemoObservable(String name) {
        super(name);
    }
}
