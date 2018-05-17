package tiger.com.lp.dailydemo.designpatterns.observer;

import android.database.DataSetObservable;
import android.database.DataSetObserver;

import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public abstract class AbstractObservable<T extends BaseModel> extends DataSetObservable{
    private String name;

    public AbstractObservable(String name) {
        this.name = name;
    }

    public abstract void notifyChanged(T t);

    @Override
    public void registerObserver(DataSetObserver observer) {
        super.registerObserver(observer);

        LogUtils.d(LogUtils.TAG, "Register observer name is: %s, size is : %s ", mObservers.size(), name);
    }

    @Override
    public void unregisterObserver(DataSetObserver observer) {
        super.unregisterObserver(observer);

        LogUtils.d(LogUtils.TAG, "Unregister observer name is: %s, size is : %s ", mObservers.size(), name);
    }
}
