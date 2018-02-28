package tiger.com.lp.dailydemo.designpatterns.bridge;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public class BridgeDemo {
    public static void main(String[] args) {
        Qiao areaB1 = new AreaB1();
        AreaA areaA = new AreaA1();
        areaA.qiao = areaB1;

        areaA.fromAreaA();
        areaA.qiao.targetAreaB();
    }
}
