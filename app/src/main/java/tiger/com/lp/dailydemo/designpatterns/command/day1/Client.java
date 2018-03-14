package tiger.com.lp.dailydemo.designpatterns.command.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Client {
    public static void main(String[] args) {
        Tv tv = new Tv();

        CommandOn commandOn = new CommandOn();
        commandOn.setTv(tv);

        CommandOff commandOff = new CommandOff();
        commandOff.setTv(tv);

        CommandChangeChannel commandChangeChannel = new CommandChangeChannel();
        commandChangeChannel.setTv(tv);
        commandChangeChannel.setChannel(1);

        MacroCommand macroCommand = new MacroTvCommand();
        macroCommand.add(commandOn);
        macroCommand.add(commandOff);

        Controller controller = new Controller(commandOn, commandOff, commandChangeChannel);

        controller.setMarcoCommand(macroCommand);
        controller.turnChangeChannel();
        controller.turnOn();
        controller.turnOff();
        controller.turnMarco();
    }
}
