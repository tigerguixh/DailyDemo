package tiger.com.lp.dailydemo.designpatterns.adapter;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class UserAdapter implements Ps2{
    private Usb usb;

    public UserAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        System.out.println("It is user adapter.");
        usb.isUsb();
    }
}
