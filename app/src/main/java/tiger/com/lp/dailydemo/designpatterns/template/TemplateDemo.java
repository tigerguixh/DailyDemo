package tiger.com.lp.dailydemo.designpatterns.template;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class TemplateDemo {
    public static void main(String[] args) {
        AbsPerson student = new Student();
        student.dressUp();

        student = new Teacher();
        student.dressUp();

        AbsPerson person = new AbsPerson() {
            @Override
            public void dressUp() {
                System.out.println("我是抽象的。");
            }
        };
        person.preapreGoSchool();
    }
}
