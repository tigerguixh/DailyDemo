package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public abstract class AbsConPerson extends Person {
    private IPerson person;

    public void setPerson(IPerson person) {
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null) {
            person.show();
        }
    }
}
