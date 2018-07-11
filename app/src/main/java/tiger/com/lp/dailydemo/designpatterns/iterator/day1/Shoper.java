package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class Shoper {
    ProductIterator iterator;

    public Shoper(ProductIterator iterator) {
        this.iterator = iterator;
    }

    public void shopProduct() {
        Iterator<ProductMenu> menuIterator = iterator.concreteIterator();
        do {
            System.out.println("商品信息： " + menuIterator.next());
        } while (menuIterator.hasNext());
    }
}
