package tiger.com.lp.dailydemo.designpatterns.Strategy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class AdvancedMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于高级会员打8折。");
        return bookPrice * 0.8;
    }
}
