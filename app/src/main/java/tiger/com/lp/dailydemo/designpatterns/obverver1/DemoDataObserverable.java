package tiger.com.lp.dailydemo.designpatterns.obverver1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/5 0005
 * @description
 */

public class DemoDataObserverable implements DataObserverable{
    private List<DataObserver> observers;
    private String message;

    public DemoDataObserverable() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerDataObserver(DataObserver observer) {

    }

    @Override
    public void unregisterDataObserver(DataObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyChanged() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).changed(message);
        }
    }

    protected void notifyInfo(String message) {
        this.message = message;
        notifyChanged();
    }
}
