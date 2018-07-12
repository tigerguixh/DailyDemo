package tiger.com.lp.dailydemo.designpatterns.factory.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/12
 * @Description :
 */
public class ShopClient {
    public static void main(String[] args) {
        ShopFacotry shopFacotry = new ShopFacotry();
        IMoveable moveable = shopFacotry.concrete();
        moveable.run();
    }
}
