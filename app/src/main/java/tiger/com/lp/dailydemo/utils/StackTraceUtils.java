package tiger.com.lp.dailydemo.utils;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2023/2/17
 * @Description :
 */
public class StackTraceUtils {
    public static String getMethodStack() {
        StringBuilder stringBuilder = new StringBuilder();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            stringBuilder.append(element.toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
