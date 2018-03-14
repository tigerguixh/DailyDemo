package tiger.com.lp.dailydemo.designpatterns.command;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        if(command != null) {
            command.execute();
        }
    }
}
