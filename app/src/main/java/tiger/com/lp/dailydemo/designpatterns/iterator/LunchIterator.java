package tiger.com.lp.dailydemo.designpatterns.iterator;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class LunchIterator implements Iterator<MenuItem>{
    private MenuItem[] menuItems;
    private int position = 0;

    public LunchIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(menuItems == null) {
            return false;
        }

        return position < menuItems.length;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
