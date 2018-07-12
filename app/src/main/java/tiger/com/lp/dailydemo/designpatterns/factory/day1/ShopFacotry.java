package tiger.com.lp.dailydemo.designpatterns.factory.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/12
 * @Description :
 */
public class ShopFacotry extends VirFactory{
    @Override
    public IMoveable concrete() {
        return new Shop();
    }
}
