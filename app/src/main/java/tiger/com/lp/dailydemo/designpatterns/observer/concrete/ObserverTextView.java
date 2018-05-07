package tiger.com.lp.dailydemo.designpatterns.observer.concrete;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/2
 * @Description :
 */
public class ObserverTextView extends TextView implements Observer{
    public ObserverTextView(Context context) {
        super(context);
    }

    public ObserverTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ObserverTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public ObserverTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public void update(Observable o, Object arg) {
        setText(arg.toString());
    }
}
