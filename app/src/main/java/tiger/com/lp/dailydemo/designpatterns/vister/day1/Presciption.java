package tiger.com.lp.dailydemo.designpatterns.vister.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/13
 * @Description :
 */
public class Presciption {
    private List<Medicine> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Medicine> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine) {
        list.add(medicine);
    }

    public void removeMedicine(Medicine medicine) {
        list.remove(medicine);
    }
}
