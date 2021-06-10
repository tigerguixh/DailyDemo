package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/1
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_FIRST)
public class ARouterActivity extends Activity {
    @Autowired
    public String name;
    @Autowired
    public String extra;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);

        LogUtils.e(LogUtils.TAG, extra + "--->" + name);

        setResult(100);
        finish();
    }
}
