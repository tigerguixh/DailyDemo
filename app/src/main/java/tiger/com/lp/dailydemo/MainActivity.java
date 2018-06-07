package tiger.com.lp.dailydemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.ui.FloatingButtonActivity;
import tiger.com.lp.dailydemo.ui.ImageActivity;
import tiger.com.lp.dailydemo.ui.MemoryActivity;
import tiger.com.lp.dailydemo.ui.NetworkActivity;
import tiger.com.lp.dailydemo.ui.ObserverActivity;
import tiger.com.lp.dailydemo.ui.OpenFileActivity;
import tiger.com.lp.dailydemo.ui.PingActivity;
import tiger.com.lp.dailydemo.ui.ScrollingActivity;
import tiger.com.lp.dailydemo.ui.SignalActivity;
import tiger.com.lp.dailydemo.ui.TimerActivity;
import tiger.com.lp.dailydemo.utils.LogUtils;

public class MainActivity extends AppCompatActivity {

    public static Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.observable:
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            case R.id.memory:
                startActivity(new Intent(this, MemoryActivity.class));
                break;
            case R.id.timer:
                startActivity(new Intent(this, TimerActivity.class));
                break;
            case R.id.network:
                startActivity(new Intent(this, NetworkActivity.class));
                break;
            case R.id.image:
                startActivity(new Intent(this, ImageActivity.class));
                break;
            case R.id.single:
                startActivity(new Intent(this, SignalActivity.class));
                break;
            case R.id.ping:
                startActivity(new Intent(this, PingActivity.class));
                break;
            case R.id.open_assets:
                startActivity(new Intent(this, OpenFileActivity.class));
                break;
            case R.id.floating_button:
                startActivity(new Intent(this, FloatingButtonActivity.class));
                break;
            case R.id.nest_scroll:
                startActivity(new Intent(this, ScrollingActivity.class));
                break;
            case R.id.arouter:
                ARouter.getInstance().build(RouterPathList.ROUTER_FIRST)
                        .withString("name", "Tiger")
                        .navigation(this, 999);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 999:
                Toast.makeText(this, "Very good!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
