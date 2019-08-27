package tiger.com.lp.dailydemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.arouter.RouterPathList;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/8/16
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_HOOK_SKIN)
public class HookSkinActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hook_skin);

        findViewById(R.id.textView).setBackground(getDrawable(R.color.colorAccent));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSkin(getPath());
            }
        });
    }
}
