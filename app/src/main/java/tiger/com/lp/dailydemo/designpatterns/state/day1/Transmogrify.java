package tiger.com.lp.dailydemo.designpatterns.state.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();

        stage.performPlay();

        stage.change();

        stage.performPlay();
    }
}
