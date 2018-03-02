package tiger.com.lp.dailydemo.designpatterns.memento;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/1 0001
 * @description
 */

public class Memento {
    private String state;

    public Memento(){}

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
