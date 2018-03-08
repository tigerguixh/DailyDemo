package tiger.com.lp.dailydemo.designpatterns.obverver1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/5 0005
 * @description
 */

public interface Observerable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
