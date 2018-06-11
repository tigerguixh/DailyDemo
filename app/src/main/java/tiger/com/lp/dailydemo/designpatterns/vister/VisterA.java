package tiger.com.lp.dailydemo.designpatterns.vister;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class VisterA {
    public void method1() {
        System.out.println("我是A。");
    }

    public void method2(VisterB visterB) {
        visterB.showA(this);
    }

}
 class VisterB{
    public void showA(VisterA visterA) {
        visterA.method1();
    }
}
