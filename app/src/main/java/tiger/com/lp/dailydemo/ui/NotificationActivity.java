package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.io.IOException;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.arouter.RouterPathList;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/11/16
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_NOTIFICATION)
public class NotificationActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        ImageView imageView = findViewById(R.id.gif);
        Drawable drawable = null;
        try {
            drawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(getResources(), R.mipmap.timg));
            imageView.setImageDrawable(drawable);
            if (drawable instanceof AnimatedImageDrawable) {
                ((AnimatedImageDrawable) drawable).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        createChannel2();
        createChannel1();
    }

    private void createChannel1() {
        NotificationChannel channel = new NotificationChannel("渠道1ID",
                "测试渠道名称1",
                NotificationManager.IMPORTANCE_HIGH);
        channel.setGroup("测试组ID");
// 获取NotificationManager
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// 创建通知渠道
        notificationManager.createNotificationChannel(channel);
    }

    private void createChannel2() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        // 创建一个渠道组
        NotificationChannelGroup channelGroup = new NotificationChannelGroup("测试组ID", "渠道组名");
// 绑定渠道组
        notificationManager.createNotificationChannelGroup(channelGroup);
        NotificationChannel channel = new NotificationChannel("渠道2ID",
                "测试渠道名称2",
                NotificationManager.IMPORTANCE_HIGH);
        channel.setGroup("测试组ID");
// 获取NotificationManager
// 创建通知渠道
        notificationManager.createNotificationChannel(channel);

        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("渠道2ID");
        notificationChannel.setDescription("这是一个渠道通知");
        notificationChannel.setName("--------");
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
