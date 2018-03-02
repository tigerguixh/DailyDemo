package tiger.com.lp.dailydemo.designpatterns.memento;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/1 0001
 * @description
 */

public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMememto(Memento memento) {
        this.memento = memento;
    }
}
