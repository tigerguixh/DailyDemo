package tiger.com.lp.dailydemo.designpatterns.command;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class ConcreteCommand implements Command{
    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if(receiver != null) {
            receiver.action();
        }
    }
}
