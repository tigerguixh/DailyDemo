package tiger.com.lp.dailydemo.designpatterns.Strategy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class PrimaryMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("初级会员没有折扣。");
        return bookPrice;
    }
}
