package tiger.com.lp.dailydemo.designpatterns.adapter;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class Usber implements Usb{
    @Override
    public void isUsb() {
        System.out.println("USB接口。");
    }
}
