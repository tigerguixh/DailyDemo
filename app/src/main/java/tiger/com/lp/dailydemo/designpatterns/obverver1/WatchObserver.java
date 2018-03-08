package tiger.com.lp.dailydemo.designpatterns.obverver1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/5 0005
 * @description
 */

public class WatchObserver implements Observerable{
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(message);
        }
    }

    public void setInfoMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
