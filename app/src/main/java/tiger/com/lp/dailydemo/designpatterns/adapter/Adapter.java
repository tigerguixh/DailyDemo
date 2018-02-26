package tiger.com.lp.dailydemo.designpatterns.adapter;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class Adapter extends Usber implements Ps2{
    @Override
    public void isPs2() {
        System.out.println("ps2接口。");
        isUsb();
    }
}
