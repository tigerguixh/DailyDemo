package tiger.com.lp.dailydemo.designpatterns.observer.concrete;

import java.util.Observable;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/2
 * @Description :
 */
public class SubjectObsevable extends Observable{

    public void update(String content) {
        setChanged();

        notifyObservers(content);
    }
}
