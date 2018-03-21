package tiger.com.lp.dailydemo.designpatterns.state;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Sunshine implements State{
    @Override
    public String getState() {
        return "大晴天";
    }
}
