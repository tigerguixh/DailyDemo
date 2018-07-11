package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class StoreMenu implements ProductIterator{
    private ProductMenu[] productMenus;

    public StoreMenu() {
        productMenus = new ProductMenu[3];
        initData();
    }

    private void initData() {
        productMenus[0] = new ProductMenu("苹果", 4);
        productMenus[1] = new ProductMenu("桃子", 3);
        productMenus[2] = new ProductMenu("香蕉", 2);
    }

    @Override
    public Iterator<ProductMenu> concreteIterator() {
        return new StoreIterator(productMenus);
    }
}
