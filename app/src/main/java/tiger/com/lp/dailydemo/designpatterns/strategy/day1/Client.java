package tiger.com.lp.dailydemo.designpatterns.strategy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class Client {
    public static void main(String[] args) {
        Price price = new Price();

        AdvancedMemberStrategy advancedMemberStrategy = new AdvancedMemberStrategy();
        price.setMemberStrategy(advancedMemberStrategy);

        System.out.println("书的实际价格：" + price.quote(600));
    }
}
