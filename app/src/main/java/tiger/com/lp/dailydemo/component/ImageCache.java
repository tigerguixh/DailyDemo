package tiger.com.lp.dailydemo.component;

import android.graphics.Bitmap;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/27
 * @Description :
 */
public interface ImageCache {
    void put(String url, Bitmap bitmap);
    Bitmap get(String url);
}
