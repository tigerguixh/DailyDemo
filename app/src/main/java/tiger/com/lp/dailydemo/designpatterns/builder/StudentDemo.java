package tiger.com.lp.dailydemo.designpatterns.builder;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .setName("张三")
                .setAge(23)
                .setSale("sale")
                .setScore(87)
                .builder();

        System.out.println(student);
    }
}
