package tiger.com.lp.dailydemo.designpatterns.template;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class Student extends AbsPerson{
    @Override
    public void dressUp() {
        System.out.println("我是学生，当然穿的是校服。");
    }
}
