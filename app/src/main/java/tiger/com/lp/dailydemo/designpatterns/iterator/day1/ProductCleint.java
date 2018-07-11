package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class ProductCleint {
    public static void main(String[] args) {
        ProductIterator menu = new StoreMenu();
        menu = new SuperMarketMenu();

        Shoper shoper = new Shoper(menu);

        shoper.shopProduct();
    }
}
