package tiger.com.lp.dailydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tiger.com.lp.dailydemo.ui.ImageActivity;
import tiger.com.lp.dailydemo.ui.MemoryActivity;
import tiger.com.lp.dailydemo.ui.NetworkActivity;
import tiger.com.lp.dailydemo.ui.ObserverActivity;
import tiger.com.lp.dailydemo.ui.OpenFileActivity;
import tiger.com.lp.dailydemo.ui.PingActivity;
import tiger.com.lp.dailydemo.ui.SignalActivity;
import tiger.com.lp.dailydemo.ui.TimerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        }
    }
}
