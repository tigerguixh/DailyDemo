package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public class Person implements IPerson {
    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(String.format("装扮的%s", name));
    }
}
