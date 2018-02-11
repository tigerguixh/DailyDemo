package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.designpatterns.observer.ActivityController;
import tiger.com.lp.dailydemo.designpatterns.observer.BaseModel;
import tiger.com.lp.dailydemo.designpatterns.observer.Demo;
import tiger.com.lp.dailydemo.designpatterns.observer.DemoObserver;
import tiger.com.lp.dailydemo.designpatterns.observer.ObserverController;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class ObserverActivity extends Activity{
    private ActivityController activityController;
    private DemoObserver demoObserver;

    private TextView info;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_observer);
        info = findViewById(R.id.info);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityController.requestRefresh(new Demo("Tiger"));
            }
        });

        activityController = new ObserverController<>(this);
        demoObserver = new DemoObserver() {
            @Override
            public <T extends BaseModel> void onChanged(T demo) {
                info.setText(demo.toString());
            }
        };

        demoObserver.initialize(activityController);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        demoObserver.unRegisterDemoObserver();
    }
}
