package tiger.com.lp.dailydemo.designpatterns.memento;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/2 0002
 * @description
 */

public class Caretaker1 {
    private Memento1 memento1;

    public Memento1 retriveMemento() {
        return memento1;
    }

    public void saveMemento(Memento1 memento1) {
        this.memento1 = memento1;
    }
}
