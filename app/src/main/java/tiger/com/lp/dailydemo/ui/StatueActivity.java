package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.designpatterns.state.day3.LoginContext;
import tiger.com.lp.dailydemo.designpatterns.state.day3.LogoutStatue;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_STATUE)
public class StatueActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_statue);

        findViewById(R.id.forward).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginContext.getInstance().forward(StatueActivity.this);
            }
        });

        findViewById(R.id.logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginContext.getInstance().setUserStatue(new LogoutStatue());
            }
        });
    }
}
