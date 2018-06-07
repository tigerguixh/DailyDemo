package tiger.com.lp.dailydemo.designpatterns.proxy.day1;

import java.lang.reflect.Proxy;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/1
 * @Description :
 */
public class DemoProxy {
    public static void main(String[] args) {
        AnimalProxy proxy = new AnimalProxy(new Animal());
        //proxy.fly();
        //proxy.run();


        Animal animal = new Animal();
        ClassLoader classLoader = animal.getClass().getClassLoader();
        Class[] classes = animal.getClass().getInterfaces();
        ProxyHandler proxyHandler = new ProxyHandler(animal);

        Object newProxy = Proxy.newProxyInstance(classLoader, classes, proxyHandler);
        Fly fly = (Fly) newProxy;
        fly.fly();

        Run run = (Run) newProxy;
        run.run();
    }
}
