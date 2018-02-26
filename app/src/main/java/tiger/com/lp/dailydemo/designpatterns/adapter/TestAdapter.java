package tiger.com.lp.dailydemo.designpatterns.adapter;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class TestAdapter extends AbsTestAdapter {
    @Override
    public void a() {
        super.a();

        System.out.println("实现A方法被调用。");
    }

    @Override
    public void b() {
        super.b();

        System.out.println("实现B方法被调用。");
    }
}
