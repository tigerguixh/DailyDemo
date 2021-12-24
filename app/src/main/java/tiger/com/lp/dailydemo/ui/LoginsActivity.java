package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.designpatterns.state.day3.LoginContext;
import tiger.com.lp.dailydemo.designpatterns.state.day3.LoginStatue;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_LOGIN)
public class LoginsActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginContext.getInstance().setUserStatue(new LoginStatue());
                startActivity(new Intent(LoginsActivity.this, StatueActivity.class));
                finish();
            }
        });
    }
}
