package tiger.com.lp.dailydemo.designpatterns.mediator.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public abstract class Conversation {
    protected String name;
    protected Monitor monitor;

    public Conversation(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    public abstract void printContent(String content);

    public abstract void contact(String content);
}
