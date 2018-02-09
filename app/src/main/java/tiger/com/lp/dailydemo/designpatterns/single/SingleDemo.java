package tiger.com.lp.dailydemo.designpatterns.single;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public class SingleDemo {
    //恶汉式
    private static SingleDemo singleDemo = new SingleDemo();

    public static SingleDemo getInstance() {
        return singleDemo;
    }

    //懒汉式
    private static SingleDemo single;

    public static SingleDemo getSingle() {
        if(single == null) {
            single = new SingleDemo();
        }
        return single;
    }

    //线程安全
    private static volatile SingleDemo demo;

    public static SingleDemo getSingleDemo() {
        if(demo == null) {
            synchronized(SingleDemo.class) {
                if(demo == null) {
                    demo = new SingleDemo();
                }
            }
        }
        return demo;
    }

    private SingleDemo() {}

    public static void main(String[] args) {

    }
}
