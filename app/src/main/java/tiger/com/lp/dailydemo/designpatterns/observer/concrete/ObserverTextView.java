package tiger.com.lp.dailydemo.designpatterns.observer.concrete;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/2
 * @Description :
 */
public class ObserverTextView extends AppCompatTextView implements Observer{
    public ObserverTextView(Context context) {
        super(context);
    }

    public ObserverTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ObserverTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void update(Observable o, Object arg) {
        setText(arg.toString());
    }
}
