package tiger.com.lp.dailydemo.designpatterns.proxy;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class UserDao implements IUserDao{
    @Override
    public void save(int age) {
        System.out.println("我已经" + age + "岁了。");
    }
}
