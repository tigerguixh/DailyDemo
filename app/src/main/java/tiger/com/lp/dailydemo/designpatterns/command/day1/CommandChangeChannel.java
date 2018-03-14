package tiger.com.lp.dailydemo.designpatterns.command.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class CommandChangeChannel implements Command{
    private Tv tv;
    private int channel;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        if(tv != null) {
            tv.changeChannel(channel);
        }
    }
}
