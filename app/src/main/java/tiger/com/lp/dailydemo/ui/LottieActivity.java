package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;

import tiger.com.lp.dailydemo.arouter.RouterPathList;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/8/1
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_LOTTIE)
public class LottieActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LottieAnimationView lottieAnimationView = new LottieAnimationView(this);

        setContentView(lottieAnimationView);

        lottieAnimationView.setAnimation("birds.json");
        lottieAnimationView.loop(true);
    }
}
