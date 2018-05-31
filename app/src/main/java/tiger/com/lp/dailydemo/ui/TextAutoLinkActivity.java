package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.util.Linkify;
import android.util.Patterns;
import android.widget.TextView;

import java.util.regex.Pattern;

import tiger.com.lp.dailydemo.R;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/25
 * @Description :
 */
public class TextAutoLinkActivity extends Activity{
    private TextView autoLink;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autolink);

        autoLink = findViewById(R.id.autolink);

    }
}
