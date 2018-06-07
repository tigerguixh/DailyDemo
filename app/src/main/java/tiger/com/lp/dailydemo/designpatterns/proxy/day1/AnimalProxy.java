package tiger.com.lp.dailydemo.designpatterns.proxy.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/1
 * @Description :
 */
public class AnimalProxy implements Fly, Run{
    private Animal animal;

    public AnimalProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void fly() {
        System.out.println("This is animal proxy fly.");
        animal.fly();
    }

    @Override
    public void run() {
        System.out.println("This is animal proxy run.");
        animal.run();
    }
}
