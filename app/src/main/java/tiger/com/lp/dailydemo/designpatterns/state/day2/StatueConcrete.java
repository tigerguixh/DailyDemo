package tiger.com.lp.dailydemo.designpatterns.state.day2;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
public class StatueConcrete {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();

        tvController.nextChannel();

        tvController.powerOff();
        tvController.nextChannel();
    }
}
