package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.View;
import android.widget.TextView;

//import com.example.ico_annotation.BindView;
//import com.example.ico_annotation.ContentView;
//import com.example.ioc_apu.ViewInjector;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.designpatterns.observer.ActivityController;
import tiger.com.lp.dailydemo.designpatterns.observer.BaseModel;
import tiger.com.lp.dailydemo.designpatterns.observer.Demo;
import tiger.com.lp.dailydemo.designpatterns.observer.DemoObserver;
import tiger.com.lp.dailydemo.designpatterns.observer.ObserverController;
import tiger.com.lp.dailydemo.designpatterns.observer.concrete.ObserverTextView;
import tiger.com.lp.dailydemo.designpatterns.observer.concrete.SubjectObsevable;
import tiger.com.lp.dailydemo.utils.HookUtils;
import tiger.com.lp.dailydemo.utils.JniUtils;
import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

//@ContentView(R.layout.activity_observer)
public class ObserverActivity extends Activity{
    private ActivityController activityController;
    private DemoObserver demoObserver;

    //@BindView(R.id.info_ob)
    public ObserverTextView info;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String boot = new String(JniUtils.getJniString());
        String update = new String(JniUtils.getJniString2());

        LogUtils.i("update_time: boot" ,boot);
        LogUtils.i("update_time: update" ,update);

        // 106216399999995

        //ViewInjector.injectView(this);
        /*findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityController.requestRefresh(new Demo("Tiger"));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeData();
            }
        });

        activityController = new ObserverController(this);
        demoObserver = new DemoObserver() {

            @Override
            public void onChanged(Demo demo) {
                info.setText(demo.toString());
            }
        };

        demoObserver.initialize(activityController);*/

        //getHost("http://androidapi22.tadu.com");
    }

    public String getHost(String url) {
        Uri uri = Uri.parse(url);
        return "";
    }

    private void changeData() {
        SubjectObsevable obsevable = new SubjectObsevable();

        obsevable.addObserver(info);

        obsevable.update("监听者模式");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //demoObserver.unRegisterDemoObserver();
    }
}
