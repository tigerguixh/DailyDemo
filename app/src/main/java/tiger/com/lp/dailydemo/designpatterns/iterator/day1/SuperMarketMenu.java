package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class SuperMarketMenu implements ProductIterator{
    private List<ProductMenu> productMenus;

    public SuperMarketMenu() {
        productMenus = new ArrayList<>();
        initMenu();
    }

    private void initMenu() {
        productMenus.add(new ProductMenu("大米", 100));
        productMenus.add(new ProductMenu("可乐", 13));
    }

    @Override
    public Iterator<ProductMenu> concreteIterator() {
        return productMenus.iterator();
    }
}
