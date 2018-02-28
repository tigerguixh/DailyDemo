package tiger.com.lp.dailydemo.designpatterns.flyweight;

import java.io.File;
import java.nio.file.Path;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class FlyweightPattern {
    static FlyweightFactory factory = new FlyweightFactory();
    static Flyweight flyweight1;
    static Flyweight flyweight2;
    static Flyweight flyweight3;
    static Flyweight flyweight4;

    public static void main(String[] args) {
        flyweight1 = factory.getFlyweight("Google");
        flyweight2 = factory.getFlyweight("Apple");
        flyweight3 = factory.getFlyweight("Google");
        flyweight4 = factory.getFlyweight("Google");

        System.out.println("size: " + factory.getFlyweightSize());

        flyweight1.operation();
        flyweight2.operation();
        flyweight3.operation();
        flyweight4.operation();
    }
}
