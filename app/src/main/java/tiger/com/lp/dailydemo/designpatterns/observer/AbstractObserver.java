package tiger.com.lp.dailydemo.designpatterns.observer;

import android.database.DataSetObserver;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public abstract class AbstractObserver<T extends BaseModel> extends DataSetObserver{
    public abstract void onChanged(T demo);
}
