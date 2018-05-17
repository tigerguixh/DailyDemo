package tiger.com.lp.dailydemo.designpatterns.observer;

import android.content.Context;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class ObserverController extends ActivityController{
    private Demo demo;

    public ObserverController(Context context) {
        super(context);

        observable = new DemoObservable("DemoObservable") {

            @Override
            public void notifyChanged(Demo demo) {
                setInfo(demo);
            }
        };
    }

    private void setInfo(Demo demo) {
        this.demo = demo;
        observable.notifyChanged();
    }

    @Override
    public Demo getInfo() {
        return demo;
    }

    @Override
    public void requestRefresh(Demo demo) {
        observable.notifyChanged(demo);
    }
}
