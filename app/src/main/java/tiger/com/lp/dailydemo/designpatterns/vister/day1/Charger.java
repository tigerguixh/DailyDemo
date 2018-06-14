package tiger.com.lp.dailydemo.designpatterns.vister.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/13
 * @Description :
 */
public class Charger extends Visitor{
    @Override
    public void visitor(MedicineA a) {
        System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }
}
