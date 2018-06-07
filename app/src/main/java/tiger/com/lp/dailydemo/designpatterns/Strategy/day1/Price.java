package tiger.com.lp.dailydemo.designpatterns.Strategy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class Price {
    private MemberStrategy memberStrategy;

    public void setMemberStrategy(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice) {
        return memberStrategy.calcPrice(bookPrice);
    }
}
