package tiger.com.lp.dailydemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/6 0006
 * @description
 */

public class NetworkReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        LogUtils.e(LogUtils.TAG, "-------> 切换了网络，意图是： " + intent.getAction() + " 网络连接状体： " + isNetworkConnected(context));
    }

    public static boolean isNetworkConnected(final Context context) {
        boolean isConnected = false;
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager != null) {
            NetworkInfo networks = manager.getActiveNetworkInfo();
            if(isConnected(networks)) {
                isConnected = true;
            }
        }
        return isConnected;
    }

    public static boolean isConnected(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

}
