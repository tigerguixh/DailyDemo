package tiger.com.lp.dailydemo.designpatterns.mediator.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class ConversationDemo {
    public static void main(String[] args) {
        ConcreteMonitor monitor = new ConcreteMonitor();
        Conversation conversationA = new ConversationA("A", monitor);
        Conversation conversationB = new ConversationB("B", monitor);
        monitor.setConversationA(conversationA);
        monitor.setConversationB(conversationB);

        conversationA.contact("我是A 你好吗？");
        conversationB.contact("我是B 我挺好的呢。");
    }
}
