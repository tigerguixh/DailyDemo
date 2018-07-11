package tiger.com.lp.dailydemo.designpatterns.iterator;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class Waitress {
    private Iterator<MenuItem> iterator;
    private Menu menu;

    public Waitress(Menu menu) {
        this.menu = menu;
    }

    public void printMenu() {
        System.out.println("\n菜单：");
        iterator = menu.createIterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
    }
}
