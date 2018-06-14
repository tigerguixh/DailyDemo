package tiger.com.lp.dailydemo.designpatterns.vister.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/13
 * @Description :
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visitor(MedicineA a);
    public abstract void visitor(MedicineB b);
}
