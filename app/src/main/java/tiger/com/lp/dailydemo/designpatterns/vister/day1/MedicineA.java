package tiger.com.lp.dailydemo.designpatterns.vister.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/13
 * @Description :
 */
public class MedicineA extends Medicine{
    public MedicineA(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
