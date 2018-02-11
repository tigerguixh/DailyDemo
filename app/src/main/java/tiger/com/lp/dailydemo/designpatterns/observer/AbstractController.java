package tiger.com.lp.dailydemo.designpatterns.observer;

import android.database.DataSetObserver;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public interface AbstractController<T extends BaseModel> {
    T getInfo();
    void requestRefresh(T t);
    void registerObserver(DataSetObserver observer);
    void unregisterObserver(DataSetObserver observer);
}
