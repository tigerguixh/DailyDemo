package tiger.com.lp.dailydemo.designpatterns.memento;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/2 0002
 * @description
 */

public class Memento1 {
    private String state;

    public Memento1(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
