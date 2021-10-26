package tiger.com.lp.dailydemo.ui;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.InvocationTargetException;

import tiger.com.lp.dailydemo.R;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/25
 * @Description :
 */
public class AnimatorActivity extends Activity {
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animator);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(button, "backgroundColor", 0xFF8080FF);
        objectAnimator.setDuration(3000);
        objectAnimator.setEvaluator(new ArgbEvaluator());
        //objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        //objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        //objectAnimator.start();

        //button.animate().setDuration(2000).rotationXBy(720).x(100).y(100).start();
        ObjectAnimator objectAnimator11 = ObjectAnimator.ofFloat(button, "scaleX",  0.3f);
        objectAnimator11.setPropertyName("scaleY");
        objectAnimator11.setFloatValues(0.3f);
        //objectAnimator11.start();

        button.animate().setDuration(3000).rotationYBy(720).x(100).y(100).start();

    }

    public static String getAndroidID() {
        try {
            String id = Settings.Secure.getString(
                    getApplicationByReflect().getContentResolver(),
                    Settings.Secure.ANDROID_ID
            );
            if ("9774d56d682e549c".equals(id)) return "";
            return TextUtils.isEmpty(id) ? "" : id;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    private static Application getApplicationByReflect() {
        try {
            @SuppressLint("PrivateApi")
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Object thread = activityThread.getMethod("currentActivityThread").invoke(null);
            Object app = activityThread.getMethod("getApplication").invoke(thread);
            if (app == null) {
                throw new NullPointerException("u should init first");
            }
            return (Application) app;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new NullPointerException("u should init first");
    }
}
