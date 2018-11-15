package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.format.Formatter;

import tiger.com.lp.dailydemo.sync.SyncAdapterManager;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/11/13
 * @Description :
 */
public class SyncActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SyncAdapterManager.init(this);

        System.out.println("File size: " + Formatter.formatFileSize(this, 10));
        System.out.println("File size: " + Formatter.formatFileSize(this, 100));
        System.out.println("File size: " + Formatter.formatFileSize(this, 1000));
        System.out.println("File size: " + Formatter.formatShortFileSize(this, 10000));
        System.out.println("File size: " + Formatter.formatShortFileSize(this, 100000));
        System.out.println("File size: " + Formatter.formatShortFileSize(this, 1000000));
        System.out.println("File size: " + Formatter.formatShortFileSize(this, 10000000));
        System.out.println("File size: " + Formatter.formatShortFileSize(this, 100000000));
        System.out.println("File size: " + Formatter.formatShortFileSize(this, 1000000000));
    }
}
