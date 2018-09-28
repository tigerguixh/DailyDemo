package tiger.com.lp.dailydemo.designpatterns.state.day3;

import android.content.Context;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/28
 * @Description :
 */
public class LoginContext implements UserStatue{
    private static volatile LoginContext instance;
    private UserStatue userStatue;

    private LoginContext() {}

    public static LoginContext getInstance() {
        if(instance == null) {
            synchronized(LoginContext.class) {
                if(instance == null) {
                    instance = new LoginContext();
                }
            }
        }
        return instance;
    }

    public void setUserStatue(UserStatue userStatue) {
        this.userStatue = userStatue;
    }

    @Override
    public void comment(Context context) {
        userStatue.comment(context);
    }

    @Override
    public void forward(Context context) {
        userStatue.forward(context);
    }
}
