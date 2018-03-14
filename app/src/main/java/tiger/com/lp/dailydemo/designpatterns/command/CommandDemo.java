package tiger.com.lp.dailydemo.designpatterns.command;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class CommandDemo {
    public static void main(String[] args) {
        //创建接收者，真正的业务逻辑执行者
        Receiver receiver = new Receiver();

        //创建命令对象，设定它的接收者
        ConcreteCommand concreteCommand = new ConcreteCommand();
        concreteCommand.setReceiver(receiver);

        //创建调用者，把它的命令对象传入
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);

        invoker.execute();
    }
}
