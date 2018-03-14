package tiger.com.lp.dailydemo.designpatterns.command.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class CommandOff implements Command{
    private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(tv != null) {
            tv.turnOff();
        }
    }
}
