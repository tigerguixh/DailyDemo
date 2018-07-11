package tiger.com.lp.dailydemo.designpatterns.iterator;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class LunchMenu implements Menu{
    private MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[5];
        initMenus();
    }

    private void initMenus() {
        menuItems[0] = new MenuItem("红烧肉", 10.0);
        menuItems[1] = new MenuItem("带鱼", 12.0);
        menuItems[2] = new MenuItem("土豆丝", 6.0);
        menuItems[3] = new MenuItem("鸡腿", 9.0);
        menuItems[4] = new MenuItem("红烧鱼", 10.0);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new LunchIterator(menuItems);
    }
}
