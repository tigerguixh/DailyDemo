package tiger.com.lp.dailydemo.designpatterns.state.day3;

import android.content.Context;
import android.widget.Toast;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
public class LoginStatue implements UserStatue{
    @Override
    public void comment(Context context) {
        Toast.makeText(context, "可以评论啦", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void forward(Context context) {
        Toast.makeText(context, "可以转发啦", Toast.LENGTH_SHORT).show();
    }
}
