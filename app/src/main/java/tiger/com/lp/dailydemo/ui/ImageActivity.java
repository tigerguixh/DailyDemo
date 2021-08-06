package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import tiger.com.lp.dailydemo.R;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/15 0015
 * @description
 */

public class ImageActivity extends Activity{
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView imageView = findViewById(R.id.image);



        Glide.with(this).load("http://buxingxing.dev.youmiyou.cn/media/reward_centers/original/2018/0314/7d2d120e875236ad78b6784083237862.jpeg").into(imageView);
    }
}
