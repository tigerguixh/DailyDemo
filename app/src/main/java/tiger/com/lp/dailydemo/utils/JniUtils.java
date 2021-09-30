package tiger.com.lp.dailydemo.utils;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/10
 * @Description :
 */
public class JniUtils {
    static {
        System.loadLibrary("hello");
    }

    public static native char[] getJniString();
    public static native String getJniString2();
    public static native int[] getJniString3();
}
