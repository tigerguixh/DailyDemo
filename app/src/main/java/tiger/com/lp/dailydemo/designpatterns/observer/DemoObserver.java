package tiger.com.lp.dailydemo.designpatterns.observer;

import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public abstract class DemoObserver extends AbstractObserver<Demo>{
    private ActivityController activityController;

    public void initialize(ActivityController activityController) {
        if(activityController == null) {
            LogUtils.e(LogUtils.TAG, "Controller can not null.");
            return;
        }
        this.activityController = activityController;
        activityController.registerObserver(this);
    }

    @Override
    public void onChanged() {
        super.onChanged();

        onChanged(activityController.getInfo());
    }

    public BaseModel getInfo() {
        if(activityController == null) {
            return null;
        }

        return activityController.getInfo();
    }

    public void unRegisterDemoObserver() {
        if(activityController == null) {
            return;
        }

        activityController.unregisterObserver(this);
    }
}
