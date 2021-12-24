package tiger.com.lp.dailydemo.designpatterns.state.day3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import tiger.com.lp.dailydemo.ui.LoginsActivity;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
public class LogoutStatue implements UserStatue{
    @Override
    public void comment(Context context) {
        gotoLogin(context);
    }

    @Override
    public void forward(Context context) {
        gotoLogin(context);
    }

    private void gotoLogin(Context context) {
        context.startActivity(new Intent(context, LoginsActivity.class));
        ((Activity) context).finish();
    }
}
