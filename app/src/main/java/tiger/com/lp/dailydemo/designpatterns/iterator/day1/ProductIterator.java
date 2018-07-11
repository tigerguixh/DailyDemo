package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

import java.util.Iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public interface ProductIterator {
    Iterator<ProductMenu> concreteIterator();
}
