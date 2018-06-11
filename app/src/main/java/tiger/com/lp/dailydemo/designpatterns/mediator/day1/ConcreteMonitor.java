package tiger.com.lp.dailydemo.designpatterns.mediator.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class ConcreteMonitor extends Monitor{
    private Conversation conversationA;
    private Conversation conversationB;

    public void setConversationA(Conversation conversationA) {
        this.conversationA = conversationA;
    }

    public void setConversationB(Conversation conversationB) {
        this.conversationB = conversationB;
    }

    @Override
    public void contact(String content, Conversation conversation) {
        if(conversation == conversationA) {
            conversationB.printContent(content);
        } else {
            conversationA.printContent(content);
        }
    }
}
