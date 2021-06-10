package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/8 0008
 * @description
 */

public class TimerActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        taskTimer();
    }

    private void taskTimer() {
        final long start = System.currentTimeMillis();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                LogUtils.e(LogUtils.TAG, "task1 invoked ! "
                        + (System.currentTimeMillis() - start));
                try
                {
                    Thread.sleep(3000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                throw new RuntimeException();
            }
        };

        TimerTask timerTask1 = new TimerTask() {
            @Override
            public void run() {
                LogUtils.e(LogUtils.TAG, "task2 invoked ! "
                        + (System.currentTimeMillis() - start));
            }
        };

        /*Timer timer = new Timer();

        timer.schedule(timerTask, 1000);
        timer.schedule(timerTask1, 3000);*/
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
        pool.schedule(timerTask, 100, TimeUnit.MILLISECONDS);
        pool.scheduleAtFixedRate(timerTask1, 0 , 1000, TimeUnit.MILLISECONDS);
    }
}
