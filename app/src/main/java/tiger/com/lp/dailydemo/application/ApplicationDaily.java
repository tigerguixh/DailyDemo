package tiger.com.lp.dailydemo.application;

import androidx.annotation.NonNull;
import androidx.multidex.MultiDexApplication;

import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;

import tiger.com.lp.dailydemo.component.skin.SkinEngine;
import tiger.com.lp.dailydemo.dagger.component.ApplicationComponent;
import tiger.com.lp.dailydemo.dagger.component.DaggerApplicationComponent;
import tiger.com.lp.dailydemo.utils.LogUtils;
import tiger.com.lp.dailydemo.utils.MiitHelper;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/1
 * @Description :
 */
public class ApplicationDaily extends MultiDexApplication implements MiitHelper.AppIdsUpdater {
    public static ApplicationDaily globalContext;
    private MiitHelper miitHelper;
    public ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        miitHelper = new MiitHelper(this);
        miitHelper.getDeviceIds(this);

        //初始化换肤引擎
        SkinEngine.getInstance().init(this);

        globalContext = this;

        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
        }
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
        applicationComponent = DaggerApplicationComponent.create();
    }


    @Override
    public void OnIdsAvalid(@NonNull String ids) {
        LogUtils.e("Tiger:", ids);
    }
}
