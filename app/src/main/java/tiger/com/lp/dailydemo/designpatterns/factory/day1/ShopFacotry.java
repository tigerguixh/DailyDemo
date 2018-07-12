package tiger.com.lp.dailydemo.designpatterns.factory.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/12
 * @Description :
 */
public class ShopFacotry extends VirFactory{

    @Override
    public <T extends IMoveable> T concrete(Class<T> clz) {
        IMoveable moveable = null;
        try{
            moveable = (IMoveable) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {

        }
        return (T) moveable;
    }
}
