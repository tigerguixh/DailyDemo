package tiger.com.lp.dailydemo.designpatterns.mediator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void getMessage(String msg);

    //与中介通信
    public abstract void contact(String msg);
}
