package tiger.com.lp.dailydemo.component.cache;

import android.graphics.Bitmap;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/27
 * @Description :
 */
public class DoubleCache implements ImageCache{
    ImageCache memoryCache = new MemoryCache();
    ImageCache diskCache = new DiskCache();

    @Override
    public void put(String url, Bitmap bitmap) {
        memoryCache.put(url, bitmap);
        diskCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = memoryCache.get(url);

        if(bitmap == null) {
            bitmap = diskCache.get(url);
        }

        return bitmap;
    }
}
