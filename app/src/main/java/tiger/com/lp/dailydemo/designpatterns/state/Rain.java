package tiger.com.lp.dailydemo.designpatterns.state;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class Rain implements State{
    @Override
    public String getState() {
        return "下雨天";
    }
}
