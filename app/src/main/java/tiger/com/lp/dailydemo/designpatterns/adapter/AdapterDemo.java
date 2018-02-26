package tiger.com.lp.dailydemo.designpatterns.adapter;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class AdapterDemo {
    public static void main(String[] args) {
        Ps2 adapter = new Adapter();
        adapter.isPs2();

        System.out.println("-----------------------");
        Ps2 user = new UserAdapter(new Usber());
        user.isPs2();

        ITestAdapter testAdapter = new TestAdapter();
        testAdapter.a();
        testAdapter.b();
    }
}
