package tiger.com.lp.dailydemo.designpatterns.strategy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class IntermediateMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于中级会员打9折。");
        return bookPrice * 0.9;
    }
}
