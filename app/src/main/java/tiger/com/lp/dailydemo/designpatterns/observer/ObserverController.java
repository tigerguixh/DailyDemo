package tiger.com.lp.dailydemo.designpatterns.observer;

import android.content.Context;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class ObserverController<T extends Demo> extends ActivityController{
    private Demo demo;

    public ObserverController(Context context) {
        super(context);

        observable = new DemoObservable("DemoObservable") {
            @Override
            public <T extends BaseModel> void notifyChanged(T t) {
                setInfo(t);
            }
        };
    }

    private void setInfo(BaseModel t) {
        demo = (Demo) t;
        observable.notifyChanged();
    }

    @Override
    public Demo getInfo() {
        return demo;
    }

    @Override
    public void requestRefresh(BaseModel o) {
        observable.notifyChanged(o);
    }
}
