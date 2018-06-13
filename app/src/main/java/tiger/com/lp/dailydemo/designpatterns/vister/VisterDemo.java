package tiger.com.lp.dailydemo.designpatterns.vister;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class VisterDemo {
    public static void main(String[] args) {
        VisterA visterA = new VisterA();
        visterA.method1();
        visterA.method2(new VisterB());

        // a d  d
    }
}
