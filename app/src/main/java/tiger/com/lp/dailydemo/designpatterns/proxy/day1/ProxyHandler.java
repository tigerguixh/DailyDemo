package tiger.com.lp.dailydemo.designpatterns.proxy.day1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/1
 * @Description :
 */
public class ProxyHandler implements InvocationHandler {
    private Animal animal;

    public ProxyHandler(Animal animal) {
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(animal, args);
    }
}
