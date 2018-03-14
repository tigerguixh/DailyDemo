package tiger.com.lp.dailydemo.designpatterns.command.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Controller {
    private Command commandOn, commandOff, commandChangeChannel;
    private Command marcoCommand;

    public Controller(Command commandOn, Command commandOff, Command commandChangeChannel) {
        this.commandOn = commandOn;
        this.commandOff = commandOff;
        this.commandChangeChannel = commandChangeChannel;
    }

    public void setMarcoCommand(Command marcoCommand) {
        this.marcoCommand = marcoCommand;
    }

    public void turnMarco() {
        marcoCommand.execute();
    }

    public void turnOn() {
        if(commandOn != null) {
            commandOn.execute();
        }
    }

    public void turnOff() {
        if(commandOff != null) {
            commandOff.execute();
        }
    }

    public void turnChangeChannel() {
        if(commandChangeChannel != null) {
            commandChangeChannel.execute();
        }
    }
}
