package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import tiger.com.lp.dailydemo.R;
import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.utils.HookUtils;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/8/16
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_HOOK)
public class HookActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook);

        Button hook = findViewById(R.id.hook);

        hook.setOnClickListener(v -> Toast.makeText(HookActivity.this, "Hook一下", Toast.LENGTH_LONG).show());

        HookUtils.hook(this, hook);
    }
}
