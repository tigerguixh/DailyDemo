package tiger.com.lp.dailydemo.designpatterns.observer;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public abstract class ActivityController implements AbstractController{
    protected Context context;
    protected AbstractObservable observable;

    public ActivityController(Context context) {
        this.context = context;
    }

    @Override
    public void registerObserver(DataSetObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void unregisterObserver(DataSetObserver observer) {
        observable.unregisterObserver(observer);
    }
}
