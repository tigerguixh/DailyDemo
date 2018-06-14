package tiger.com.lp.dailydemo.designpatterns.vister.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/13
 * @Description :
 */
public class Client {
    public static void main(String[] args) {
        Medicine a = new MedicineA("板蓝根", 11);
        Medicine b = new MedicineB("感恩", 14.3);

        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);

        Visitor charger = new Charger();
        charger.setName("张三");

        Visitor worker = new WorkerOfPharmacy();
        worker.setName("李四");

        presciption.accept(charger);

        presciption.accept(worker);
    }
}
