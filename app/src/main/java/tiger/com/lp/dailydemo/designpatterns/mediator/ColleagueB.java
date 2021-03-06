package tiger.com.lp.dailydemo.designpatterns.mediator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class ColleagueB extends Colleague{
    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("同事B" + name + "获得信息" + msg);
    }

    @Override
    public void contact(String msg) {
        mediator.contact(msg, this);
    }
}
