package tiger.com.lp.dailydemo.designpatterns.state.day2;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
public class TvController implements PowerController, TvStatue{
    private TvStatue tvStatue;

    private void setTvStatue(TvStatue tvStatue) {
        this.tvStatue = tvStatue;
    }

    @Override
    public void powerOn() {
        setTvStatue(new PowerOnStatue());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvStatue(new PowerOffStatue());
        System.out.println("关机啦");
    }

    @Override
    public void nextChannel() {
        tvStatue.nextChannel();
    }

    @Override
    public void prevChannel() {
        tvStatue.prevChannel();
    }

    @Override
    public void turnUp() {
        tvStatue.turnUp();
    }

    @Override
    public void turnDown() {
        tvStatue.turnDown();
    }
}
