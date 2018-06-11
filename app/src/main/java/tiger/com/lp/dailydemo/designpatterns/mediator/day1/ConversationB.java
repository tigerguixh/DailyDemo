package tiger.com.lp.dailydemo.designpatterns.mediator.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class ConversationB extends Conversation{
    public ConversationB(String name, Monitor monitor) {
        super(name, monitor);
    }

    @Override
    public void printContent(String content) {
        System.out.println("同事B: " + name + " 获得信息：" + content);
    }

    @Override
    public void contact(String content) {
        monitor.contact(content, this);
    }
}
