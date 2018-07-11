package tiger.com.lp.dailydemo.designpatterns.iterator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class IteratorClient {
    private static Menu menu = null;
    private static Waitress waitress = null;

    public static void main(String[] args) {
        initEvent();
        operate();
    }

    private static void initEvent() {
        menu = new BreakfastMenu();
        Utils.initMenuItem((BreakfastMenu)menu);

        menu = new LunchMenu();

        waitress = new Waitress(menu);
    }

    private static void operate() {
        waitress.printMenu();
    }
}
