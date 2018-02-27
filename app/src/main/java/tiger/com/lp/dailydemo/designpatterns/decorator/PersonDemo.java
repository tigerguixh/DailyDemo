package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public class PersonDemo {
    public static void main(String[] args) {
        IPerson person = new Person("衣服。");

        AbsConPerson personA = new ConCreatePersonA();
        AbsConPerson personB = new ConcreatePersonB();

        personA.setPerson(person);
        personB.setPerson(personA);

        personB.show();
    }
}
