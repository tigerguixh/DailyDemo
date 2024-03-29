package tiger.com.lp.dailydemo;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.TimerTask;

import dagger.hilt.android.AndroidEntryPoint;
import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.dao.MyDatabase;
import tiger.com.lp.dailydemo.databinding.ActivityMainBinding;
import tiger.com.lp.dailydemo.ui.AiDouActivity;
import tiger.com.lp.dailydemo.ui.AnimatorActivity;
import tiger.com.lp.dailydemo.ui.BottomSheetActivity;
import tiger.com.lp.dailydemo.ui.CanvasActivity;
import tiger.com.lp.dailydemo.ui.ComposeActivity;
import tiger.com.lp.dailydemo.ui.ConstraintLayoutActivity;
import tiger.com.lp.dailydemo.ui.DeepLinkActivity;
import tiger.com.lp.dailydemo.ui.FloatingButtonActivity;
import tiger.com.lp.dailydemo.ui.ImageActivity;
import tiger.com.lp.dailydemo.ui.JniActivity;
import tiger.com.lp.dailydemo.ui.LoginActivity;
import tiger.com.lp.dailydemo.ui.MemoryActivity;
import tiger.com.lp.dailydemo.ui.MotionActivity;
import tiger.com.lp.dailydemo.ui.MotionSlideActivity;
import tiger.com.lp.dailydemo.ui.MvvmActivity;
import tiger.com.lp.dailydemo.ui.NetworkActivity;
import tiger.com.lp.dailydemo.ui.ObserverActivity;
import tiger.com.lp.dailydemo.ui.OpenFileActivity;
import tiger.com.lp.dailydemo.ui.PingActivity;
import tiger.com.lp.dailydemo.ui.ReaderActivity;
import tiger.com.lp.dailydemo.ui.RoomDaoActivity;
import tiger.com.lp.dailydemo.ui.ScrollingActivity;
import tiger.com.lp.dailydemo.ui.SignalActivity;
import tiger.com.lp.dailydemo.ui.SyncActivity;
import tiger.com.lp.dailydemo.ui.TimerActivity;
import tiger.com.lp.dailydemo.ui.TrendingActivity;
import tiger.com.lp.dailydemo.ui.ViewModelActivity;
import tiger.com.lp.dailydemo.ui.VyfiActivity;
import tiger.com.lp.dailydemo.ui.WorkerActivity;
import tiger.com.lp.dailydemo.utils.HookUtils;
import tiger.com.lp.dailydemo.utils.JniUtils;
import tiger.com.lp.dailydemo.viewmodel.TimeViewModel;
import tiger.com.lp.dailydemo.viewmodel.TimeWithLiveDataViewModel;

public class MainActivity extends AppCompatActivity {

    public static Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = this;
        setContentView(ActivityMainBinding.inflate(LayoutInflater.from(this)).getRoot());
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
            case R.id.rxjava:
                ARouter.getInstance().build(RouterPathList.ROUTER_RXJAVA)
                        .navigation();
                break;
            case R.id.lottie:
                ARouter.getInstance().build(RouterPathList.ROUTER_LOTTIE)
                        .navigation();
                break;
            case R.id.animator:
                startActivity(new Intent(this, AnimatorActivity.class));
                break;
            case R.id.login:
                ARouter.getInstance().build(RouterPathList.ROUTER_LOGIN)
                        .navigation();
                break;
            case R.id.sync:
                startActivity(new Intent(this, SyncActivity.class));
                break;
            case R.id.notification:
                ARouter.getInstance().build(RouterPathList.ROUTER_NOTIFICATION)
                        .navigation();
                break;
            case R.id.hook:
                ARouter.getInstance().build(RouterPathList.ROUTER_HOOK)
                        .navigation();
                break;
            case R.id.hook_skin:
                ARouter.getInstance().build(RouterPathList.ROUTER_HOOK_SKIN)
                        .navigation();
                break;
            case R.id.deeplink:
                startActivity(new Intent(this, DeepLinkActivity.class));
                break;
            case R.id.constraint:
                /*ARouter.getInstance().build(RouterPathList.ROUTER_CONSTRAINT)
                        .navigation();*/
                startActivity(new Intent(this, ConstraintLayoutActivity.class));
                break;
            case R.id.view_model:
                startActivity(new Intent(this, ViewModelActivity.class));
                break;
            case R.id.room_dao:
                startActivity(new Intent(this, RoomDaoActivity.class));
                break;
            case R.id.jni:
                startActivity(new Intent(this, JniActivity.class));
                break;
            case R.id.bottom_sheet:
                startActivity(new Intent(this, BottomSheetActivity.class));
                break;
            case R.id.worker:
                startActivity(new Intent(this, WorkerActivity.class));
                break;
            case R.id.mvvm:
                startActivity(new Intent(this, MvvmActivity.class));
                break;
            case R.id.dagger:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.reader:
                startActivity(new Intent(this, ReaderActivity.class));
                break;
            case R.id.compose:
                startActivity(new Intent(this, ComposeActivity.class));
                break;
            case R.id.trending:
                startActivity(new Intent(this, TrendingActivity.class));
                break;
            case R.id.aidou:
                //startActivity(new Intent(this, AiDouActivity.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("agoo://com.tadu.read/thirdpush")));
                break;
            case R.id.motion:
                startActivity(new Intent(this, MotionActivity.class));
                break;
            case R.id.motion_slide:
                startActivity(new Intent(this, MotionSlideActivity.class));
                break;
            case R.id.canvas:
                startActivity(new Intent(this, CanvasActivity.class));
                break;
            case R.id.vyfi:
                startActivity(new Intent(this, VyfiActivity.class));
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

    @Override
    protected void onDestroy() {
        super.onDestroy();

        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        am.clearApplicationUserData();
    }
}
