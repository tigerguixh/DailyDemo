package tiger.com.lp.dailydemo.designpatterns.command.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Tv {
    private int currentChannel = 0;

    public void turnOn() {
        System.out.println("打开电视了。");
    }

    public void turnOff() {
        System.out.println("关闭电视了。");
    }

    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println("现在是这个频道了： " + channel);
    }
}
