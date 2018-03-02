package tiger.com.lp.dailydemo.designpatterns.memento;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/2 0002
 * @description
 */

public class Originator1 {
    private String state;

    public Memento1 createMementor() {
        return new Memento1(state);
    }

    public void restoreMementor(Memento1 memento1) {
        this.state = memento1.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
