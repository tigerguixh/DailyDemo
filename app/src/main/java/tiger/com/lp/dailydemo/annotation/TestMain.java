package tiger.com.lp.dailydemo.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
public class TestMain {
    public static void main(String[] args) {
        List<Integer> tes = new ArrayList<>();
        Collections.addAll(tes, 47, 48, 49);
        trackTes(tes, TestAnnotation.class);
    }

    public static void trackTes(List<Integer> tes, Class<?> cl) {
        for (Method method : cl.getDeclaredMethods()) {
            Test test = method.getAnnotation(Test.class);
            if (test != null) {
                System.out.println("id: " + test.id() + ", desc: " + test.description());
            }
        }
    }
}
