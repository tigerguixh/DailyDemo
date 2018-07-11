package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class StoreIterator implements Iterator<ProductMenu>{
    private ProductMenu[] productMenus;
    private int position = 0;

    public StoreIterator(ProductMenu[] productMenus) {
        this.productMenus = productMenus;
    }

    @Override
    public boolean hasNext() {
        if(productMenus == null) return false;

        return position < productMenus.length;
    }

    @Override
    public ProductMenu next() {
        ProductMenu menu = productMenus[position];
        position++;
        return menu;
    }
}
