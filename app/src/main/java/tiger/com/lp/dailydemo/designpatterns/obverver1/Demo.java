package tiger.com.lp.dailydemo.designpatterns.obverver1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/5 0005
 * @description
 */

public class Demo implements DataObserver{
    private String key;

    public Demo(String key) {
        this.key = key;
    }

    @Override
    public void changed(String message) {

    }
}
