package tiger.com.lp.dailydemo.designpatterns.command;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/22
 * @Description :
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal local = new ThreadLocal();

        local.set("Hello");

        System.out.println(local.get());

        local.set("Java");

        System.out.println(local.get());
    }
}
